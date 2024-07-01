package datadrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practiceLoginTest 
{
	@Test(dataProvider="ExcelData",dataProviderClass=CustomeData.class)
  public void Logintest(String un,String psw) 
  {
	  WebDriver driver =new EdgeDriver();
	  driver.get("https://practice.expandtesting.com/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  
  
  }
}
