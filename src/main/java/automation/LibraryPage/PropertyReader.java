package automation.LibraryPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String applicationConfigReader(String key) throws IOException{
	try
	{
		File f = new File("./ConfigurationFiles/ApplicationConfig.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	catch(Exception e) {}
	return null;
	
	}
	
	
	public static String elementLocatorReader(String key) {
		try
		{
		File f = new File(".\\ElementLocators\\Locator.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	catch(Exception e) {}
		return null;
	}
}
