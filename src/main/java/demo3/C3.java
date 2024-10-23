package demo3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("C3");
	}
	@AfterSuite
	void as() {
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	void bs() {
		System.out.println("BeforeSuite");
	}
}
