package com.velan.Selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.time.Duration;
import java.util.*;

public class Register {

	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void register() {
	    driver.get("http://localhost:3000/register");
	    driver.manage().window().setSize(new Dimension(1536, 816));
	    driver.findElement(By.name("Name")).click();
	    driver.findElement(By.name("Name")).sendKeys("velan");
	    driver.findElement(By.name("Email")).click();
	    driver.findElement(By.name("Email")).sendKeys("cvelanias@gmail.com");
	    driver.findElement(By.name("Password")).click();
	    driver.findElement(By.name("Password")).sendKeys("12345");
	    driver.findElement(By.name("ConfrimPassword")).click();
	    driver.findElement(By.name("ConfrimPassword")).sendKeys("12345");
	    driver.findElement(By.name("MobileNumber")).click();
	    driver.findElement(By.name("MobileNumber")).sendKeys("9876543210");
	    //driver.findElement(By.name("City")).click();
        driver.findElement(By.name("City")).sendKeys("Dindigul");
	    //driver.findElement(By.name("submit")).click();
	    assertEquals("Register Successfully", "Register Successfully"); 
	  }
}
