package testngDemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AmazonreadProperties
{
  @Test
  public void Amazontest() 
  {
	  WebDriver  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  List<WebElement> li=driver.findElements(By.xpath("(//option[@value])"));   
  System.out.println("total options are:"+li.size());
	  for(WebElement i:li)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Watches"))
		  {
			  i.click();
			 break;
			  
			  
		  }
	  }
     WebElement li2= driver.findElement(By.id("twotabsearchtextbox"));
     li2.sendKeys("boyswacthes");
     li2.sendKeys(Keys.ENTER);
     
  }
}
