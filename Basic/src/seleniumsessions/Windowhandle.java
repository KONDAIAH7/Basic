package seleniumsessions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle 
{

	@Test
	public void singlewindowhandle() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window id:"+parentwindow);
	
		//driver.findElement(By.id("newWindowBtn")).click();
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>handles=driver.getWindowHandles();
		for(String handle:handles)
		{	System.out.println(handle);
			if(!handle.equals(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("kk");
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("power");
		Thread.sleep(2000);
		
	
		
	}
	
}
