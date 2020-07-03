package annotaion_homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion_homewrok extends annotation_homework2 {
	@Test
	public void assertionPrec (){
		// exp - requirement or mock-up/design
		// act - build by dev
		String exp = "Sign Up";
		String act = driver.findElement(By.xpath("//*[@id=\"u_0_12\"]")).getText();
		System.out.println ("my actual text is: " + act);
		Assert.assertEquals(act, exp); // assert or hard assert
	}
}
