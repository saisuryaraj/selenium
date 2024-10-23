package testng;

import org.testng.annotations.Test;

public class SignupTests {
	@Test(priority = 1,groups= {"regression"})
	void signupByemail()
	{
		System.out.println("signup by email");
	}
	@Test(priority = 2,groups= {"regression"})
	void signupByfacebook()
	{
		System.out.println("signup by facebook");
	}
	@Test(priority = 3,groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println("signup by twitter");
	}
}
