package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotationtesting {
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This will execute before class");
	}
	
	@Test
	public void Demo3()
	{
		System.out.println("hello demo 3");
	}
	
	@Test
	public void Demo4()
	{
		System.out.println("bye demo 4");
	}
	
	@BeforeMethod  //this will execute after each and every test method .
	void beforeMethod()
	{
		System.out.println("This will execute Before every method..");
	}
	
	@AfterMethod //this will execute after executing or after completion of the test method
	void afterMethod()
	{
		System.out.println("This will execute After every method...");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("This will execute after class");
	}
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("This will execute before starting of whole test- suit level");
	}

	
	@AfterSuite
	void aftersuite()
	{
		System.out.println("This will execute after compiliting whole test- suit level");
	}
	
}
