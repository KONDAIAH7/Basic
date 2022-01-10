package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocators {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//ID
		WebElement usname = driver.findElement(By.id("txtUsername"));
		usname.sendKeys("Admin");
		//name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//classname
		//driver.findElement(By.className("button")).click();
		
		/*Xpath
		//driver.findElement(By.xpath("//*[@id='btnLogin']")).click();*/
		
		//CSS Selector
		driver.findElement(By.cssSelector("#btnLogin")).click();
		

	}

}
