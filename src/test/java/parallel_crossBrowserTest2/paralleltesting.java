package parallel_crossBrowserTest2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class paralleltesting 
{
  @Test(priority=1)
  public void chrometest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.Amazon.in");
	  System.out.println("Title is:"+driver.getTitle());
  }

  @Test(priority=2)
  public void firefox()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com");
	  System.out.println("Title is:"+driver.getTitle());
	  
  }
@Test(priority=3)
public void edge()
{
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.flipkart.com");
    System.out.println("Title is :"+driver.getTitle());
}
  

}



