package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousemovement 
{

	@Test
	public void mousetest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		WebElement rightclickbtn=driver.findElement(By.cssSelector(".context-menu-one "));
		act.contextClick(rightclickbtn).build().perform();
		WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copytext=copy.getText();
		copy.click();
		
		
	}
}
