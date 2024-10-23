package demo3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test()
	{
		//Assert.assertEquals("xyz","xyz");
		//Assert.assertEquals(123,123);
		//Assert.assertNotEquals(123,1123);
		//Assert.assertTrue(true);
		//Assert.assertTrue(1==2);//fail
		//Assert.assertFalse(1==2);//pass
		//Assert.assertFalse(2==2);//fail
		Assert.fail();
	}
}
