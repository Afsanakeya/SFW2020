package test_signIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Config;
import loc_val.SignInSignup;

public class LoginWithValidCredentialUsingEmail extends Config{

	SignInSignup signIn = new SignInSignup();
	
	@Test
	public void loginWithValidCredentialUsingEmailTest(){
		System.out.println ("login With Valid Credential Using Email Test start");
		// click on sign in link from header
		clickByXpath (signIn.signInLinkLoc);
		// Enter email
		typeByCss (signIn.emailLoc, signIn.emailValue);
		// click Next button
		clickByXpath (signIn.nextButtonLoc);
		// enter password
		typeByXpath (signIn.passwordLoc, signIn.passValue);
		// click Sign In button
		clickByXpath (signIn.signInButtonLoc);
		// Assert --- most important 
		String act = driver.findElement(By.xpath(signIn.myActualFullNameLoc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = "TalentTEK Consulting"; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);

	}	
}

