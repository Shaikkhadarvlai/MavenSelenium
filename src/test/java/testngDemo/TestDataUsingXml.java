package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataUsingXml
{
	@Parameters({"un","psw"})
  @Test
  public void logingTest(String un,String psw)
  {
	System.out.println("User Name is"+un);
	System.out.println("Password is :"+psw);
	  
	  
  }
}
