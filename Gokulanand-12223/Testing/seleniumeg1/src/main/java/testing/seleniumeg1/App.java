package testing.seleniumeg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).submit();    
    }
}
