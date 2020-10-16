package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import Codemodular.Firstselenium;

public class Propertiesfile {

	static Properties prop=new Properties();
	
	public static void main(String[] args) 
	
	
	{
		readpropertiesfile();
		writepropertiesfile();
		readpropertiesfile();

	}
	public static void readpropertiesfile()
	{
		try 
		{
			FileInputStream inp=new FileInputStream("E:\\TESTING\\Automation\\Basic\\src\\config\\config.properties");
			prop.load(inp);
			Firstselenium.browser=prop.getProperty("browser");
			System.out.println((Firstselenium.browser));
		
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}
	public static void writepropertiesfile()
	{
		try
		{
			FileOutputStream out= new FileOutputStream("E:\\TESTING\\Automation\\Basic\\src\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(out, null);
		
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
