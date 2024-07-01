package mouseKeybordHAndlingActions_Robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Scrollin_Page 
{
	
  @Test
  public void amzonscrolltest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Thread.sleep(2000);
	  js.executeScript("window.scroll(0,1000)");
	  
	  

  }
}
