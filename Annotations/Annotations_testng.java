package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_testng {
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This will execute before class - class level");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("hello");
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("bye");
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
		System.out.println("This will execute after class- class level");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("This will execute before Test - Test level");
	}

	
	@AfterTest
	void afterTest() {
		System.out.println("This will execute after Test - Test level");
	}
	
}
