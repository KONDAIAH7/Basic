package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehoverdemo 
{

	@Test
	public void mousemovement() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://mrbool.com/search/");
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		
	}
}
