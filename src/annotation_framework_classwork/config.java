package annotation_framework_classwork;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;


public class config {

	public static WebDriver driver;

// CONFIG FATHER -- HE HAVE HIS STUFF, PLUS HE HAVE EVERYTHING HIS FATHER HAD "WEBDRIVERFUNCTION"
public class Config extends WebDriverFunction {

	public String url 		= "http://www.facebook.com";
	public String frameLoc1 	= "//input[@name='firstname']";
	public String frameLoc 	= "//input[@name='lastname']";
	public String frameVal1 	= "Talent";
	public String frameVal 	= "TEK";

	@BeforeSuite
	public void dbConnect() throws SQLException {
		//dbConnection();
		getCurrentTime();
	}  


	/*@BeforeClass
	public void beforeClass(){
		System.out.println (" my test class -- happen only once ...........");
	}
*/
	@BeforeMethod // it happens before each single test method
	public void openBrowser(){
		
	System.setProperty("webdriver.chrome.driver","/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
	driver = new ChromeDriver();
		System.out.println (" chrome driver open ++++++++++++++++ ");
	driver.get(url);
	}

	@Test
	public void signUpFbTest(){
		System.out.println (" facebook sign up test");
		driver.findElement(By.xpath(frameLoc1)).sendKeys(frameVal1);
		driver.findElement(By.xpath(frameLoc)).sendKeys(frameVal);

	}

//	@Test
//	public void loginTest(){
//		 selenium code
//		System.out.println (" facebook Login test");
//	 create new account
//		 login
//		 logout
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
}
    }