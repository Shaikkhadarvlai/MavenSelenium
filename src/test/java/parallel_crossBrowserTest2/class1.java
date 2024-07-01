package parallel_crossBrowserTest2;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
	@Test
	  public void chrometest()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.Amazon.in");
		  System.out.println("Title is:"+driver.getTitle());
	  }
}
