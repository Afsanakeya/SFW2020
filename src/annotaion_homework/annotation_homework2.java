package annotaion_homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_homework2 extends webdriver_function{
	public String url 		= "http://www.facebook.com";
	public String fnameLoc 	= "//input[@name='firstname']";
	public String lnameLoc 	= "//input[@name='lastname']";
	public String fnameVal 	= "New";
	public String lnameVal 	= "Name";
	public String frameloc1 ="//*[@id=\"email\"]";
	public String frameloc2 ="//*[@id=\"pass\"]";
	public String fnameVal1 = "New";
	public String fnameVal2	= "Name";
	public String frameloc3 ="//*[@id=\"u_0_r\"]";	
	public String frameVal3	= "64637";
	public String frameloc4 ="//*[@id=\"password_step_input\"]";
	public String frameval4 ="new password";
	public String radiolocator="//*[@id=\"u_0_y\"]/span[2]/label";
	
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

	@Test(priority=1)
	public void signUpFbTest() throws InterruptedException{
		System.out.println (" facebook sign up test");
		driver.findElement(By.xpath(fnameLoc)).sendKeys(fnameVal);
		driver.findElement(By.xpath(lnameLoc)).sendKeys(fnameVal2);
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void signinfbtest() throws InterruptedException {
		System.out.println (" facebook sign in test");
		driver.findElement(By.xpath(frameloc1)).sendKeys(fnameVal1);
		driver.findElement(By.xpath(frameloc2)).sendKeys(fnameVal2);
		Thread.sleep(2000);
	}
	@Test (priority=3)
	public void skipTest(){
		System.out.println (" This test is going to be skipped since no longer needed");
		driver.findElement(By.xpath(frameloc4)).sendKeys(frameval4);
		throw new SkipException ("skipping this test because business requiment is changed. Here is the JIRA Ticket # SF-7");
	}

	@Test(priority=2)
	public void inputmobileno() throws InterruptedException {
		System.out.println ("Insert valid mibile number");
		driver.findElement(By.xpath(frameloc3)).sendKeys(frameVal3);

		Thread.sleep(2000);

	}

	@Test(priority=5, enabled=false)
	public void disableTest(){
		driver.findElement(By.xpath(radiolocator)).click();
		System.out.println (" Don't want to exectue the test at all and it won't show up in report");
	}
	@Test(priority=6, enabled=true)
	public void tryCatchTest(){
		System.out.println (" try catch block test");
		String actual 		= "facebook";
		String expected 	= "Facebook";
		try {
			Assert.assertEquals(actual, expected);
		}catch (Throwable issue){
			System.err.println ("actual is not matching with expected" + issue);
		}
	}
	//@Test
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
