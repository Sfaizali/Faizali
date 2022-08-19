package SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClasss {

//	POM CLass
//	1. WebDriver declare
//	2. WebElement inspect-->@FIndBy
//	3. WebElement action -->method-->encapsulation
//	4. Class constructor-->WebDriver driver arg;
	
	private WebDriver driver;
	private Select s;
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement SettingButton;
	public void ClickSetting()
	{
		SettingButton.click();
	}
	
	//Logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	public void LogoutButton()
	{
	Logout.click();	
	}
	
	//Bag Button
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	public void ClickBagButton()
	{
		bagButton.click();
	}
	
	//Add to Cart
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement AddtoCart;
	public void HitAddtoCart()
	{
	AddtoCart.click();
	}
	
	//Add to Cart Text
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private	WebElement CartButton;
	public String getTextfromCart()
	{
	String TotalProducts= CartButton.getText();
	return TotalProducts;
	}
	
	//Multiple Element
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProducts;
	public void clickAllProducts()
	{
//	allProducts.get(0).click();
//	allProducts.get(1).click();
//	allProducts.get(2).click();
//	allProducts.get(3).click();
//	allProducts.get(4).click();
//	allProducts.get(5).click();
	
//	For Loop
	for(int i=0; i<=allProducts.size(); i++)
	{
		allProducts.get(i).click();
	}
	
		
	//drpDown
//	@FindBy(xpath="//form//div[2]//input") 
//	private WebElement dropDown;
//	public void clickOnDropDown()
//	{
//		dropDown.click();
//		s.selectByVisibleText("Text");
//	}
	
	
	
	}
	
	public HomePOMClasss(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//s= new Select(dropDown);
	}
	
	}
