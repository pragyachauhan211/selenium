package dataProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataPro {
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\pragy\\OneDrive\\Desktop\\Selenium Basic\\seleniumBasic\\data.properties");
		prop.load(fis);
		return prop.getProperty(key);		
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println(getGlobalValue("URL"));
	}

}
