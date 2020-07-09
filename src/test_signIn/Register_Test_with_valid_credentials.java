package test_signIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import loc_val.SignInSignup;

public class Register_Test_with_valid_credentials extends Config{
	
SignInSignup signIn = new SignInSignup();
	
	@Test
	public void register_test_with_valid_credential(){
		System.out.println ("Register With Valid Credential Using Email and password Test start");
	
		clickById(signIn.register_link_loc);
		typeByXpath(signIn.reg_email_loc,signIn.email_value);
		clickByXpath(signIn.get_started_loc);
		typeByXpath(signIn.create_password_loc,signIn.pass_value);
		typeByXpath(signIn.confirm_pass_loc,signIn.pass_value);
		clickByXpath(signIn.create_acc_loc);
		String act = driver.findElement(By.xpath(signIn.my_actual_loc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = "Welcome to Booking.com"; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);




	}


}
