package reports;

import com.aventstack.extentreports.MediaEntityBuilder;

import utils.ScreenshotUtils;

public class ExtentLogger 
{
	public static void pass(String message)
	{
		ExtentManager.getExtentTest().pass(message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	
	public static void fail(String message)
	{
		ExtentManager.getExtentTest().fail(message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
}
