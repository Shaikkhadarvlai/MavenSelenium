package datadriventest2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import datadrivenTest.CustomeData;


public class guru99 
{
	
	@Test(dataProvider="testdata2",dataProviderClass=customedata.class)
	public void loginTest(String un,String psw)
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
