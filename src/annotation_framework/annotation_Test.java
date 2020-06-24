package annotation_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_Test {
	public static WebDriver driver;
	
	public String url 		= "http://www.facebook.com";
	public String fnameLoc 	= "//input[@name='firstname']";
	public String lnameLoc 	= "//input[@name='lastname']";
	public String fnameVal 	= "New";
	public String lnameVal 	= "Name";

	@BeforeMethod // it happens before each single test method
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println (" chrome driver open ++++++++++++++++ ");
	}
	
	@Test
	public void signUpFbTest(){
		System.out.println (" facebook sign up test");
		driver.findElement(By.xpath(fnameLoc)).sendKeys(fnameVal);
		driver.findElement(By.xpath(lnameLoc)).sendKeys(lnameVal);
		
	}
	
//	@Test
//	public void loginTest(){
//		// selenium code
//		System.out.println (" facebook Login test");
//		// create new account
//		// login
//		// logout
//	}
//	
//	@Test
//	public void logoutTest(){
//		// selenium code
//		System.out.println (" facebook Logout test");
//	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println (" browser is about to close +++++++ ");
		driver.close();
		System.out.println (" browser is closeded +++++++ ");
	}
	
	
	@AfterSuite
	public void tearDown(){

		driver.quit();
		System.out.println (" Terminated WD +++++++ ");
	
	}

}



