package SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	
	private WebDriver driver;
	private Actions act;
	
	
	@FindBy(xpath="//form//div[1]//input")
	private WebElement Username;
	
	public void SendUsername()
	{
	Username.sendKeys("standard_user");	
	}
	
	@FindBy(xpath="//form//div[2]//input")
	private WebElement Password;
	public void SendPassword()
	{
	Password.sendKeys("secret_sauce");	
	}
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
	private WebElement LoginButton;
	public void ClickLogin()
	{
	LoginButton.click();
	
	// or Mouse Actions
	// act.click(LoginButton).perform();
	
	}
	
	public LoginPOMClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	act = new Actions(driver);
	}
	
	


}
