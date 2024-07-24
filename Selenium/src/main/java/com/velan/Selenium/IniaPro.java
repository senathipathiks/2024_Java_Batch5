package com.velan.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniaPro {

	public static void main( String[] args )
    {
       WebDriver driver=new ChromeDriver();
       driver.get("https://sangam.relevantz.com");
       driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("velan.chelladurai");
       driver.findElement(By.name("password")).sendKeys("asdfghjkl1234@");
       driver.findElement(By.name("submit")).submit();
       
       
    }
}
