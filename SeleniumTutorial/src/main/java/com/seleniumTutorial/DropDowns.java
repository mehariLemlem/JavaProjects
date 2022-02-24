package com.seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/meharilemlem/Documents/Java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://spicejet.com/");
        driver.findElement(By.xpath("//div[@class='d-flex']")).click();
        driver.findElement(By.xpath("//button[@data-value='AUH']")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("Agra")).click();
        Thread.sleep(2000);

        //driver.close();

    }

}
