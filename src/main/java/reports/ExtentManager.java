package reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager 
{
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<ExtentTest>();
	
	public static void setExtentTest(ExtentTest test)
	{
		extTest.set(test);
	}
	
	public static ExtentTest getExtentTest()
	{
		return extTest.get();
	}
	
	public static void unloadReports()
	{
		extTest.remove();
	}
}
