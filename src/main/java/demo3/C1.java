package demo3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void abc()
	{
		System.out.println("C1");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test");
	}
}
