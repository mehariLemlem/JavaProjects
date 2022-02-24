package com.seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        // Setting the path for browser drivers
        System.setProperty("webdriver.chrome.driver","/Users/meharilemlem/Documents/Java/chromedriver");

        // Creating class object to access class methods
        WebDriver driver = new ChromeDriver();
        // Hit url on the browser
        driver.get("http://www.google.com");
        // Validate if your page title is correct
        System.out.println(driver.getTitle());
        // Validate if you are landed on correct url
        System.out.println(driver.getCurrentUrl());
        // Print page source
        //System.out.println(driver.getPageSource());

        driver.get("http://www.yahoo.com");
        driver.navigate().back();
        Thread.sleep(2000);

        /*
        * Every object may not have ID, ClassName, or Name --> Xpath and CSS preferred.
        * Alphanumeric IDs may vary every refresh --> Check before using them.
        * Confirm the link object with anchor "a" tag.
        * Selenium doesn't accept class names with spaces as locators --> Compound classes can't
        *       be accepted
        * If duplicate attributes are given to selenium as locator, it scans from TOP-LEFT, catches
        *       the first one and ignores the rest. But doesn't throw an error.
        * Double quotes inside double quotes are not accepted.
        * xpath/css can be defined in n number of ways.
        * Right-click --> copy --> copy xpath on blue-highlighted HTML code to generate xpath.
        * Firepath (used to copy xpath) depreciated from firefox 56 onwards.
        * When xpath starts with html, it is not reliable --> change browser to get another one.
        * There is no direct way to get css in chrome. You will find it in toolbar.
        * Validating css/xpath locators --> $("<path>") for css, $x("<path>") for xpath. Then copy-paste
        *       and run in console/element
        * //tagName[@Attribute='Value'] --> xpath syntax. We can also pass TagName by *.
        * tagName[Attribute='Value'] --> CSS syntax. We can also pass TagName by *.
        *       tagName#id, tagName.className
        * //tagName[contains(@attribute, 'value')] --> xpath Regex.
        * tagName[attribute*= 'value'] --> CSS Regex.
        * Parent-child relationship. Identify the unique parent/grandparent path, and then
        *       traverse to the intended child/grandchild path.
        * Relative xpath --> Doesn't depend on parent nodes ==> more preferred than Absolute xpath.
        *       //star[@attribute='value'] )
        * Absolute xpath --> parent/child traversed ==> affected by when parent path updated.
        *       //parent/child/.../child[@attribute='value']
        * Moving/switching between Siblings when the parent is dynamic and one of the siblings is static:
        *       //parent/child[@attribute='value']/following-sibling::tagName[index]
        * The only major difference between xpath and css ==> in css you can't traverse back while it is possible with xpath.
        * Traversing to parent (//parent/child[@attribute='value']/parent::tagName) ==> this is only possible with xpath.
        * Text-based webElement identification (//star[text()='value'). Note ==> 1) consider spaces while hard-coding
        *       the text value 2) this technique is only recommended on demand (example when proper information is not given).
        * On using ChroPath and FirePath, they make us easy to write, edit, extract and evaluate XPath and CSS queries on any
        *       webpage and saves at least 40–50% manual effort in automation script writing.
        * Drop-downs (Static, Dynamic) management:
        */

        // Locating WebElements [id, name, linkText]
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Forgot password?")).click();

        // Opening new web page and locating webElements [id, name, className]
        driver.navigate().to("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        //driver.findElement(By.className("button r4 wide primary")).click();//Error - Compound class names not permitted
        driver.findElement(By.id("Login")).click();


        //Opening new web page and locating webElements [xpath, css]
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("How are you");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234567");
        driver.findElement(By.name("login")).click();
        // Print the error/message display
        System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());



        /*
        WebDriver.Close() This method is used to close the current open window.
        It closes the current open window on which driver has focus on.
        WebDriver.Quit() This method is used to destroy the instance of WebDriver.
        It closes all Browser Windows associated with that driver and safely ends the session.
        WebDriver.Quit() calls Dispose.
        WebDriver.Dispose() This method closes all Browser windows and safely ends the session
        */



        //driver.close(); // It closes current browser
        //driver.quit(); // It closes all browsers opened by Selenium script
    }
}
