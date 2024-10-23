package demo3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	//@Test
	void test_hardassertions()
	{
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(2,2);
		
		System.out.println("testing");
		System.out.println("testing");
	}
	@Test
	void test_softassertion()
	{
		System.out.println("testing");
		System.out.println("testing");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,2);
		
		System.out.println("testing");
		System.out.println("testing");
		sa.assertAll();
	}
}
