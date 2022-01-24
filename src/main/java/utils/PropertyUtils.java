package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import constants.FrameworkConstants;

public final class PropertyUtils 
{
	private PropertyUtils()
	{
		
	}
	
	private static Properties prop = new Properties();
	
	static
	{
		try
		{
			FileInputStream fin = new FileInputStream(new File(FrameworkConstants.getPropertyFilePath()));
			prop.load(fin);
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public static String get(String key)
	{
		return prop.getProperty(key);
	}
}
