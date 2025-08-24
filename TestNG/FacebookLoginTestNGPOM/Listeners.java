package FacebookLoginTestNGPOM;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{
	public void onStart(ITestContext context) 
	{
		System.out.println("test execution started");
	}

	public void onTestStart(ITestResult result)
	{
		System.out.println("test case execution started"  +" " +result.getName());
	}
	public void onTestSuccess (ITestResult result)
	{
		System.out.println("test case execution success"  +" " +result.getName());
	}
	public void onTestFailure (ITestResult result)
	{
		System.out.println("test case execution failed"  +" " +result.getName());
	}
	public void onTestSkipped (ITestResult result)
	{
		System.out.println("test case execution skipped"  +" " +result.getName());
	}
	public void onFinish(ITestContext context) 
	{
		System.out.println("test execution Finished");
	}
}

