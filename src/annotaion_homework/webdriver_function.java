package annotaion_homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class webdriver_function {
	WebDriver driver;

//	public void openURL(String url){
//		System.setProperty("webdriver.chrome.driver", "C:/Users/TalentTEK/Documents/GitHub/SFW2020/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(url);
//	}

	// @TEST -- this is our test
	// BeforeMethod
	// AfterMethod
	// BeforeTest
	// AfterTest

	// keep all the re-usable functions
	

	public void dbConnection() throws SQLException{
		String connectionUrl =
				"jdbc:sqlserver://yourserver.database.windows.net:1433;"
						+ "database=AdventureWorks;"
						+ "user=yourusername@yourserver;"
						+ "password=yourpassword;"
						+ "encrypt=true;"
						+ "trustServerCertificate=false;"
						+ "loginTimeout=30;";

		Connection connection = DriverManager.getConnection(connectionUrl);
		System.out.println ("my database is connected now" + connection);
	}
	public void getCurrentTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date)); 
		System.out.println (" my test suite started at this time --> " +formatter.format(date));
	}
}
