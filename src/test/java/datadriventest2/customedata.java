package datadriventest2;

import org.testng.annotations.DataProvider;

public class customedata 
{
	@DataProvider(name="testdata2")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Admin","admin123"},{"Pooja","test123"}};
		return data;
		
	}
	

}
