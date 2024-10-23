package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login --> @BeforeMethod
 * search --> @Test
 * logout --> @AfterMethod
 * login
 * adv search -->@Test
 * logout
 * */

public class AnnotationsDemo {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login..");
	}
	@Test
	void search()
	{
		System.out.println("This is search");
	}
	@Test
	void advsearch()
	{
		System.out.println("This is advSearch");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout..");
	}
	
}
