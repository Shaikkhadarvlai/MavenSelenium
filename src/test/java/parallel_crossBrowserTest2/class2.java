package parallel_crossBrowserTest2;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class class2 {
	@Test
	  public void firefox()
	  {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.myntra.com");
		  System.out.println("Title is:"+driver.getTitle());
		  
	  }
}
