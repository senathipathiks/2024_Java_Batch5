package com.karthi.SeleniumExample;

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
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://iniapro.relevantz.com/login");
    }
}
