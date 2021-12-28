package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		//Creating reference variable
		WebDriver driver = new ChromeDriver();
		
		
		// ==== part#1 ====

		//getting a web page
		driver.get("https://www.amazon.in/");
		
		//Maximizing the web page
		driver.manage().window().maximize();
		
		//sleep time
		Thread.sleep(4000);
		
		//Finding web elements and do some operations against them
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.linkText("Tecno")).click();
		
		//Navigating another web page
		driver.navigate().to("https://www.edureka.co/blog/webelement-in-selenium/");
		Thread.sleep(4000);
		
		//navigate back to previous web page
		driver.navigate().back();
		Thread.sleep(4000);
		
		
		//=== Part#2 ===
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_h_5P")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "facebook";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Test successful!");
		} else {
			System.out.println("Test Failure!");
			
		}
		
		
		//quit the browser
		driver.quit();
		
		
		
		
		
	}
	
}
