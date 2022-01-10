package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handlealerts 
{
	@Test
	public void alertmethod()
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();

		String actualmsg= driver.switchTo().alert().getText();
		System.out.println("alert message:"+actualmsg);
		driver.switchTo().alert().accept();
		
	/*	String expectedmsg="Please select start";
		Assert.assertEquals(actualmsg, expectedmsg);  */
		
		driver.quit();
		
		
	
		
	}
	
}
