package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setReportName("Functional Testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Computer Name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Surya");
		extent.setSystemInfo("os","windows10");
		extent.setSystemInfo("browser Name","Chrome");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test =  extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Passed" + result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case Failed" + result.getName());
		test.log(Status.FAIL, "Test case failed cause" + result.getThrowable());
		
	}
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "test case skipped" + result.getName());
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
}
