package testpackage;


import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class infonaltest1rc {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.n11.com/");
		selenium.start();
	}

	@Test
	public void testInfonaltest() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("");
		selenium.click("link=Giriş Yap");
		selenium.waitForPageToLoad("30000");
		assertEquals("Giriş Yap - n11.com", selenium.getTitle());
		selenium.type("id=email", "testotomasyon1@outlook.com");
		selenium.type("id=password", "123456ot");
		selenium.click("loginButton");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=searchData");
		selenium.type("id=searchData", "samsung");
		selenium.click("css=a.searchBtn");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=2");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPageToLoad("");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
