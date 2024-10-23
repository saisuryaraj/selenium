package testng;

import org.testng.annotations.Test;

/*1 open app
 *2 Login to application
 *3 logout
 * */
//     -3 -2 -1 0 1 2 3
public class FirstTestCase {
	@Test(priority=-1)
	void openapp()
	{
		System.out.println("opening app");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login to app");
	}
	//@Test // it will consider as 0 if no priority is provided
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from app");
	}

}