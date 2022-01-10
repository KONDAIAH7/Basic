package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handleframe

{

	@Test
	public void testframe() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("kk");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select cour_dd=new Select(driver.findElement(By.id("course")));
		cour_dd.selectByVisibleText("Python");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("cool");
		driver.quit();
		
		
		
	}
	
}
