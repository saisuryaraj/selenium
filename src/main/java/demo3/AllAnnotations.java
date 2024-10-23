package demo3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	void as() {
		System.out.println("AfterSuite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	void at()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("before class");
	}
	@AfterClass
	void ac()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	void am()
	{
		System.out.println("After Method");
	}
	
	@Test(priority = 1)
	void tm1()
	{
		System.out.println("method1");
	}
	@Test(priority = 2)
	void tm2()
	{
		System.out.println("method2");
	}
	
}
