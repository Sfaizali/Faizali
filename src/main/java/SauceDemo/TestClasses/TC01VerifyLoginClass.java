package SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyLoginClass extends TestBaseClass
{
	@Test
	public void verifyLogin()
	{
		//Home Page
		//Validation
		
		String ExpectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(ExpectedTitle, actualTitle);
		
	}
}
