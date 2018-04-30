package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		
		driver = new FirefoxDriver();
	}
	@Test
	public void test001(){
		
	
		driver.get("http://www.gmail.com");
		
	}

}
