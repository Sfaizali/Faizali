package SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import SauceDemo.POMClass.HomePOMClasss;


public class TC04VerifyMultipleProducts extends TestBaseClass

{
	@Test
	public void VerifyMultipleProducts()
	{
		//Home Page
		HomePOMClasss hp = new HomePOMClasss(driver);
		hp.clickAllProducts();
		System.out.println("Clicked All Products");
	
		String expecteCount ="6";
		String actualCount = hp.getTextfromCart();
		
		Assert.assertEquals(expecteCount, actualCount);
	
	}
	
}
