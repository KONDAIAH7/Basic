package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BCQAM {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://qshell.bluecherry.com/BCQAM_QShell/CGS_PQA/PQA/WEB/#/login");
		driver.manage().window().maximize();
		//driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("inputEmail3")).sendKeys("ADMIN");
		driver.findElement(By.id("inputPassword3")).sendKeys("jsmith");
		driver.findElement(By.cssSelector(".btn-primary")).click();
	
	/*	Thread.sleep(2000);
		WebElement vendordrop=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ng-view/div/div/div/div[1]/div[2]/form/div[2]/div/div/select"));
		
		Select drop=new Select(vendordrop);
		drop.selectByValue("13");
		
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		
		
		  Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[2]/li[3]/a[1]"))).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//li[contains(text(),'Cosmo')]")).click();    
		
		*/
		
		//inspection creation
	/*	driver.findElement(By.xpath("//body/div[@id='content']/div[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
		
	
		//new inspection
		driver.findElement(By.xpath("//thead/tr[1]/th[8]/input[1]")).sendKeys("1452711");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[3]")).click();
		
		WebElement insptype=driver.findElement(By.xpath("//select[@id='Select1']"));
		Select inspdrop=new Select(insptype);
		Thread.sleep(3000);

		inspdrop.selectByValue("6");
		
		WebElement status=driver.findElement(By.xpath("//select[@id='Select2']"));
		Select statusdrop=new Select(status);
		Thread.sleep(3000);
		statusdrop.selectByValue("8");
		
		WebElement inspector=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/select[1]"));
		Select inspectordrop=new Select(inspector);
		Thread.sleep(3000);
		inspectordrop.selectByValue("0");
		
		driver.findElement(By.xpath("//textarea[@id='Textarea1']")).sendKeys("Test123");
		driver.findElement(By.xpath("//textarea[@id='Textarea2']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
		Thread.sleep(2000);   */
		
		
		
		
	/*summary
		
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/input[1]")).sendKeys("QAMD-1st-02346");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//tbody/tr[@id='ins_2345']/td[2]/div[1]/span[3]/button[2]/span[2]")).click();
		
		
			//driver.findElement(By.xpath("//body/div[@id='content']/div[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]/span[1]")).click();
			*/
		
		
		
		
		//driver.quit();
		
	}

}
