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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.time.Duration;
import java.util.*;

public class DeleteStudentTest {

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
	  public void deleteTest() {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1536, 816));
	    driver.findElement(By.linkText("View Student")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	    assertEquals("Do you want to delete", txt);
	    assertEquals("Data has deleted","Data has deleted");
	  }
}
