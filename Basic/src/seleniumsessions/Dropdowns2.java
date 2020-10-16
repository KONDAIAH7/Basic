package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns2

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
		List<WebElement>month_list=month_dd.getOptions();
		int total_month=month_list.size();
		System.out.println("total months in list are:"+total_month);
		for(WebElement ele:month_list)
		{
			String monthname=ele.getText();
			System.out.println("month names are:"+monthname);
		}
		
		
		
	}

}
