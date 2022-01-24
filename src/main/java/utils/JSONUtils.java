package utils;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import constants.FrameworkConstants;

public final class JSONUtils 
{
	private static JSONParser jsonparser;
	private static FileReader fr;
	private static Object obj;
	private static JSONObject jobj;
	
	private JSONUtils()
	{
		
	}
	
	static
	{
		try
		{
			jsonparser = new JSONParser();
			fr = new FileReader(new File(FrameworkConstants.getJsonFilePath()));
			obj = jsonparser.parse(fr);
			jobj = (JSONObject)obj;
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public static String get(String key)
	{
		return jobj.get(key).toString();
	}
}
