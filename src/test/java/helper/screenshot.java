package helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{

	public static void getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  
		  //location
		  File dest=new File("./"+"\\Screenshots\\gurur99igester"+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
