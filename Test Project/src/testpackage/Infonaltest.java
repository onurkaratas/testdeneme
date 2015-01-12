package testpackage;

/*public class Infonaltest {

}
*/


//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Infonaltest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.n11.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInfonal() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Giri� Yap")).click();
    assertEquals("Giri� Yap - n11.com", driver.getTitle());
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("testotomasyon1@outlook.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("123456ot");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("searchData")).click();
    driver.findElement(By.id("searchData")).clear();
    driver.findElement(By.id("searchData")).sendKeys("samsung");
    driver.findElement(By.cssSelector("a.searchBtn")).click();
    driver.findElement(By.linkText("2")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 /* private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
  */
}