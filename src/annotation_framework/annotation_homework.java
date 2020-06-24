package annotation_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_homework {
	public static WebDriver driver;
	public String url="https://www.amazon.com/";
	public String search="//input[@type='text']";
	public String val="Apple Airpods";

	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println("Browser successfully open Amazon homepage....");
		Thread.sleep(2000);
	}
	// Test
	@Test
	public void SearchOption() {
		System.out.println("Sucessfully search for Apple Airpods....");
		driver.findElement(By.xpath(search)).sendKeys(val);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		System.out.println("Sucessfully select the option");
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	}
	@Test
	public void mousehover_signin_option() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(2000);
	}


	@AfterMethod
	public void Close_Browser() {
		System.out.println("Browser is about to be closed....");
		driver.close();
		System.out.println("Browser is sucessfully closed....");
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
		System.out.println (" Terminated Windows..... ");
	}
}

