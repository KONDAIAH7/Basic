package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns

{
	@Test
	public void selectedmonth() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		Thread.sleep(2000);
		
		
		WebElement monthdropdown =driver.findElement(By.xpath("//*[@id='month']"));
		Select month_dd=new Select(monthdropdown);
		
		month_dd.selectByIndex(5);
		Thread.sleep(3000);
		month_dd.selectByValue("7");
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Oct");
		
		
		
		
	}

}
