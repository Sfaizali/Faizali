package SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import SauceDemo.POMClass.HomePOMClasss;

public class TC02VerifyLogoutClass extends TestBaseClass
{
	@Test
	public void verifyLogout()
	{
		//Home Page
		//Setting Button + Logout Button
		
		HomePOMClasss hp = new HomePOMClasss(driver);
		hp.ClickSetting();
		System.out.println("Settings Button Clicked");
	
		hp.LogoutButton();
		System.out.println("Logout Button Clicked");
		
		//Login Page Validation
		//Validation
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	
	
	}
}
