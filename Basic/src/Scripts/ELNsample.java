package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELNsample {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://elnectd.azurewebsites.net");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement am=driver.findElement(By.xpath(""));
	
	}

}
