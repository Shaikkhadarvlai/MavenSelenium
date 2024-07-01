package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Guru99test 
{
 @Parameters({"un","psw"})
  @Test
  public void logintest   (String un,String psw) 
  {
	// Create a driver session
				WebDriver driver=new EdgeDriver();
				
				//global wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		         driver.get("https://demo.guru99.com/test/login.html");
				
				//user name
				driver.findElement(By.id("email")).sendKeys("un");
				driver.findElement(By.id("passwd")).sendKeys("psw");
				driver.findElement(By.id("SubmitLogin")).click();
	
  }
}
