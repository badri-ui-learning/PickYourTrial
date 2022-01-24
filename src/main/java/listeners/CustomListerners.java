package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reports.ExtentLogger;
import reports.ExtentReport;

public class CustomListerners implements ITestListener,ISuiteListener 
{

	public void onStart(ISuite suite) 
	{
		ExtentReport.initReports();	
	}

	public void onFinish(ISuite suite) 
	{
		ExtentReport.flushReports();	
	}

	public void onTestStart(ITestResult result) 
	{
		ExtentReport.createTest(result.getMethod().getMethodName(),result.getTestClass().getRealClass().getSimpleName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		ExtentLogger.pass(result.getMethod().getMethodName()+" is Passed");	
	}

	public void onTestFailure(ITestResult result) 
	{
		ExtentLogger.fail(result.getMethod().getMethodName()+" is Failed");
	}

	public void onTestSkipped(ITestResult result) 
	{

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
