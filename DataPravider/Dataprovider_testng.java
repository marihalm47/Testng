package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_testng
{
	
	
	@DataProvider(name="logintest")
	public Object[][] getData()
	{
		Object[][] data= {{"abc@gmail.com","123"},{"mmm@ggg.com","222"},{"log@gmail.com","log123"}};
		return data;
		
	}
	
	@Test (dataProvider="logintest")
	void loginDemo(String email,String pwd)
	{
		System.out.println(email+"  "+pwd);
	}

	
}
