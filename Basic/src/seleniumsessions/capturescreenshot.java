package seleniumsessions;


import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;



public class capturescreenshot
{


	

	@Test
	public void screenshot() throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Utility.capturescreenshots(driver, "browserstarted");
		driver.findElement(By.id("email")).sendKeys("kkking");
		Utility.capturescreenshots(driver, "Usernameentry");
		
		
		
	}
	
	
	
	
}
