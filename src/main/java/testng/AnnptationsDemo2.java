package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * login --> @BeforeClass
 * search --> @Test
 * adv search -->@Test
 * logout--> @AfterClass
 * */

public class AnnptationsDemo2 {
	
	@BeforeClass
	void login()
	{
		System.out.println("This is login..");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout..");
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
	
	
}
