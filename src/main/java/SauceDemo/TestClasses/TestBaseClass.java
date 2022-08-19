package SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import SauceDemo.POMClass.LoginPOMClass;
import SauceDemo.UtilityClass.ScreenshotClass;


public class TestBaseClass 
{

	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void SetUp(String browserName) throws IOException
	{
	
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "./driverFolder/chromedriver.exe");	
	driver= new ChromeDriver();
	}
	
	else
	{
		System.setProperty("webdriver.edge.driver", "./DriverFolder/msedgedriver.exe");	
		driver= new EdgeDriver();
	}
	
	System.out.println("Browser is Opened");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL Opened");
	
	driver.manage().window().maximize();
	System.out.println("Browser Maximized");
	
	ScreenshotClass.takeScreenshot(driver);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	LoginPOMClass lp = new LoginPOMClass(driver);
	lp.SendUsername();
	System.out.println("Username is Entered");
	
	lp.SendPassword();
	System.out.println("Password is Entered");
	
	lp.ClickLogin();
	System.out.println("Login Button Clicked");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser Closed");
	}
	
	
	
}
