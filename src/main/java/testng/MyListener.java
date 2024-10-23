package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onStart(ITestResult result) {//only once before starting test
		System.out.println("on start");
	}
	public void onTestStart(ITestResult result) {//multiple times before starting test
		System.out.println("test started");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}
	public void onFinish(ITestResult result) {//only once
		System.out.println("execution completed");
	}
}