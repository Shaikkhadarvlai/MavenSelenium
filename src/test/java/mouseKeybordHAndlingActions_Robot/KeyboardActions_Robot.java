package mouseKeybordHAndlingActions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class KeyboardActions_Robot {

	public static void main(String[] args) throws AWTException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.linkText("About")).click();
		
		//TAB---->ENTER (Keyboard)
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}