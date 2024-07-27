package com.prabha.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).submit();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//        driver.alert, driver.switchto
        driver.navigate().to("https://www.selenium.dev/");
            driver.navigate().to("https://www.selenium.dev/blog/2024/browserstack-selenium-partnership/");
          
//        driver.manage()
    
    }
}
