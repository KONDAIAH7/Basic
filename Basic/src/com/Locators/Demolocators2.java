package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocators2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Linktext
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Partial link text
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		
		//Tagname
		System.out.println(driver.findElements(By.tagName("img")).size());
		
		
		
		
		
		;

	}

}
