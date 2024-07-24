package com.velan.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       //driver.navigate().to("http://sangam.relevantz.com");
       driver.manage().window().maximize();
       driver.findElement(By.name("q")).sendKeys("selenium");
       driver.findElement(By.name("btnK")).submit();
       System.out.println(driver.findElement(By.name("q")).getText());
       
    }
}
