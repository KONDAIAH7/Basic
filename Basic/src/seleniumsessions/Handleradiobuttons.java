package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleradiobuttons {

	public static void main(String[] args) 
	
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		System.out.println(driver.getTitle());
		List<WebElement>radio= driver.findElements(By.xpath("//*[@name='lang' and @type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			WebElement localradio= radio.get(i);
			String value= localradio.getAttribute("value");
			System.out.println("values from radiobuttons are:"+value);
			
			if(value.equalsIgnoreCase("Ruby"))
			{
				localradio.click();
				
			}
			
		}
		//checkbox
		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox']"));
		for(int i=0;i<checkbox.size();i++)
		{
		
			WebElement ele=checkbox.get(i);
			String id=ele.getAttribute("id");
			System.out.println("values from checkbox are;"+id);
			if(id.equalsIgnoreCase("code"))
			{	{ele.click();
				break;
			}
			
			}
			
		}
		

	}

}
