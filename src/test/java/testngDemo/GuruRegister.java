package testngDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.screenshot;



public class GuruRegister extends screenshot
{
	 WebDriver driver;
  @Test(priority=1)
  public void Contact_infromation() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	
      driver.findElement(By.name("firstName")).sendKeys("khadar");
      driver.findElement(By.name("lastName")).sendKeys("vali");
      driver.findElement(By.name("phone")).sendKeys("947821995656");
      driver.findElement(By.name("userName")).sendKeys("khadarvali@123");
  }
  @Test(priority=2)
  public void  Mailing_Information()
  {
	  driver.findElement(By.name("address1")).sendKeys("giddalur523357");
	  driver.findElement(By.name("city")).sendKeys("giddalur");
	  driver.findElement(By.name("state")).sendKeys("AndraPradesh");
	  driver.findElement(By.name("postalCode")).sendKeys("523357");
	  List<WebElement> list1=driver.findElements(By.xpath("//option"));
       System.out.println("Total countrys are:-"+list1.size());
     for(WebElement i:list1)
     {
    	 System.out.println(i.getText());
    	 if(i.getText().contains("ZIMBABWE"))
    	 {
    		 i.click();
    		break;
    		 
    	 }
     }
       
  }
@Test(priority=3)
public void User_infromation() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("khadar18@mail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vali13251");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("vali13251");
	 screenshot.getScreenshot(driver);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	screenshot.getScreenshot(driver);

}
}
