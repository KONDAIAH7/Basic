package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class BCQAM {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://qshell.bluecherry.com/BCQAM_QShell/CGS_PQA/PQA/WEB/#/login");
		driver.manage().window().maximize();
		//driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputEmail3")).sendKeys("ADMIN");
		driver.findElement(By.id("inputPassword3")).sendKeys("jsmith");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		//driver.quit();

	}

}
