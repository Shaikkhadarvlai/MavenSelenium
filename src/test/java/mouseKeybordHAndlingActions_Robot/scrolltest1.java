package mouseKeybordHAndlingActions_Robot;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrolltest1 {
  @Test
  public void ScrollPageTest() throws InterruptedException 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://practice.expandtesting.com/scrollbars");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		   Thread.sleep(300);
		   js.executeScript("window.scroll(0,3000)");
		  
		   Thread.sleep(300);
		   js.executeScript("window.scroll(0,3000)");
		   
		   Thread.sleep(3000);
		   js.executeScript("document.querySelector(\"body > main:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(5)\").scrollLeft=300");
		   
  }
}
