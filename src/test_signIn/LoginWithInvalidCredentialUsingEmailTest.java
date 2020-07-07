package test_signIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import loc_val.SignInSignup;


public class LoginWithInvalidCredentialUsingEmailTest extends Config{

	SignInSignup signIn = new SignInSignup();

	@Test
	public void loginWithInValidCredentialUsingEmailTest(){
		System.out.println ("login With Valid Credential Using Email Test start");

		clickByXpath(signIn.signInLinkLoc);
		typeByCss(signIn.emailLoc, signIn.emailValue);
		clickByXpath(signIn.nextButtonLoc);
		typeByXpath(signIn.passwordLoc, signIn.wrongpass);
		clickByXpath(signIn.signInButtonLoc);
		String act = driver.findElement(By.xpath(signIn.inlinelocator)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = "The email and password combination you entered doesn't match."; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);

	}


}


