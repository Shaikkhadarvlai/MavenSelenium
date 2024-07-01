package datadrivenTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo 
{
  @Test
  public void reportTest() 
  {
	  //creat ExtentReport insttance
	  ExtentReports extent=new ExtentReports();
	  
	  //Using Reporter we can add path
	  ExtentSparkReporter spark=new ExtentSparkReporter("Reports/Automation.htmal");
	  //setup any configuration
	  spark.config().setDocumentTitle("Srint1 report");
	  spark.config().setReportName("AutomationTesting Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	   //attached the report
	  extent.attachReporter(spark);
	  
	  //creat a test-ExtentTest
	  ExtentTest test=extent.createTest("Test1");
	  
	  //logs
	  test.pass("Test case is pass!");
	  test.fail("Test case is fail");
	  test.info("Test is in progress");
	  test.skip("Test case is skiped");
	  
	 
	  //exit from report
	  extent.flush();
	  
  }
}
