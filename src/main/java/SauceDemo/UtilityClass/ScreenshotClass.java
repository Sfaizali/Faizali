package SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{

	public static void takeScreenshot(WebDriver driver) throws IOException
	{

	//Date & Time format code
	
	Date d= new Date();
	DateFormat d1= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String Date = d1.format(d);
	
	//Screenshot
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile= new File("./ScreenshotFolder/SauceDemo"+Date+".jpg");
	FileHandler.copy(sourceFile, destFile);
	System.out.println("Login Screenshot is taken");
}
}
