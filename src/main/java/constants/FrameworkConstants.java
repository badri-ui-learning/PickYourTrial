package constants;

public final class FrameworkConstants 
{
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver";
	private static final String FIREFOXDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/Executables/geckodriver";
	private static final String PROPERTYFILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
	private static final String JSONFILEPATH = System.getProperty("user.dir")+"/src/test/resources/data/appdata.json";
	
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/extent-test-output";
	private static final String EXTENTREPORTFILEPATH = EXTENTREPORTFOLDERPATH+"/index.html";
	
	public static String getChromeDriverPath()
	{
		return CHROMEDRIVERPATH;
	}
	
	public static String getFirefoxDriverPath()
	{
		return FIREFOXDRIVERPATH;
	}
	
	public static String getPropertyFilePath()
	{
		return PROPERTYFILEPATH;
	}
	
	public static String getJsonFilePath()
	{
		return JSONFILEPATH;
	}
	
	public static String getExtentReportPath()
	{
		return EXTENTREPORTFILEPATH;
	}
}
