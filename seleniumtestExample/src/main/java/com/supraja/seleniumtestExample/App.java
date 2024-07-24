package com.supraja.seleniumtestExample;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com");
//        
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
////        driver.switchTo().alert().accept();
//        driver.navigate().to("http://sangam.relevantz.com");
//        
//        driver.manage().window().maximize();
////        driver.findElement(By.name("q")).sendKeys("selenium");
////        driver.findElement(By.name("btnK")).click();
//        driver.findElement(By.name("username")).sendKeys("supraja.balakumar");
//        driver.findElement(By.name("password")).sendKeys("sdfghjk");
//        driver.findElement(By.name("submit")).submit();
        driver.get("https://www.google.com/");
//        driver.manage().window().setSize(new Dimension(1536, 807));
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        {
          WebElement element = driver.findElement(By.id("dimg_5"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        {
          WebElement element = driver.findElement(By.tagName("body"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element, 0, 0).perform();
        }
        {
          WebElement element = driver.findElement(By.id("APjFqb"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).clickAndHold().perform();
        }
        {
          WebElement element = driver.findElement(By.id("APjFqb"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        {
          WebElement element = driver.findElement(By.id("APjFqb"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("APjFqb")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        driver.findElement(By.cssSelector("form > div:nth-child(1)")).click();
        
        
    }
}
