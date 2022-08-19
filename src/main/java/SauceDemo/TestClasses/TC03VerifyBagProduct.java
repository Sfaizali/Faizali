package SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import SauceDemo.POMClass.HomePOMClasss;


public class TC03VerifyBagProduct extends TestBaseClass
{
	@Test
	public void VerifyBagProduct()
	{
		//Home Page
		
		HomePOMClasss hp = new HomePOMClasss(driver);
		hp.ClickBagButton();
		System.out.println("Bag Button Clicked");
	
		//Validation
		//addToCart- Text >> getText
	
		String expectedCount = "1";
		String actualCount = hp.getTextfromCart();
		
		Assert.assertEquals(expectedCount, actualCount);
	}
}
