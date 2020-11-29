package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		// System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qshell.bluecherry.com/BCQAM_QShell/CGS_PQA/PQA/WEB/#/login");
		//driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		

	}

}
