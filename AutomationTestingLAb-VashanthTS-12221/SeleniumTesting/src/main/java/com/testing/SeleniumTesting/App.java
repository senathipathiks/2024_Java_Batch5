package com.testing.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
     
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
        driver.findElement(By.name("btnK")).submit();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("http://sangam.relevantz.com");
//        driver.switchTo().alert().dismiss();
//        driver.manage().addCookie();
       System.out.println( driver.getTitle());
    }
}
