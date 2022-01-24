package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import constants.FrameworkConstants;

public class ExtentReport 
{
	private static ExtentReports extent;
	
	public static void initReports()
	{
		if(extent == null)
		{
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportPath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Test Automation Framework");
			spark.config().setReportName("PickYourTrial Automation");
		}
	}
	
	public static void createTest(String testname,String category)
	{
		ExtentManager.setExtentTest(extent.createTest(testname).assignCategory(category));
	}
	
	public static void flushReports()
	{
		if(extent!=null)
		{
			extent.flush();
			ExtentManager.unloadReports();
		}
	}
}
