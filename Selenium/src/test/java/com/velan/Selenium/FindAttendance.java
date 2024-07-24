package com.velan.Selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class FindAttendance {

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
	  public void findAttendance() {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1536, 815));
	    driver.findElement(By.cssSelector("li:nth-child(7) .btn")).click();
	    driver.findElement(By.id("search")).click();
	    driver.findElement(By.id("search")).sendKeys("8");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	  }
}
