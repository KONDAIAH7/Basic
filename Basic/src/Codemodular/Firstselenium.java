package Codemodular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Propertiesfile;

public class Firstselenium {

	public static String browser;
	static WebDriver driver;
	
	
	
	
	public static void main(String[] args)
	
	{
		//setbrowser();
		Propertiesfile.readpropertiesfile();
		setbrowsercnfig();
		runtests();
		Propertiesfile.writepropertiesfile();

	}
	
	public static void setbrowser()
	{
		browser="chrome";
	}
	public static void setbrowsercnfig()
	{
		
		if(browser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\TESTING\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
	public static void runtests()
	{
		driver.get("http://qshell.bluecherry.com/BCQAM_QShell/CGS_PQA/PQA/WEB/#/login");
		//driver.get("https://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
