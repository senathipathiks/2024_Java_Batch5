package com.supraja.AlumniSelenium;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Addalumni {

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() throws MalformedURLException {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	void testsuccess() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/addalumni");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.name("aname")).click();
		driver.findElement(By.name("aname")).sendKeys("gigaa");
		driver.findElement(By.name("dept")).click();
		driver.findElement(By.name("dept")).sendKeys("cs");
		driver.findElement(By.name("passedoutyear")).click();
		driver.findElement(By.name("passedoutyear")).sendKeys("2021");
		driver.findElement(By.name("currentstatus")).click();
		driver.findElement(By.name("currentstatus")).sendKeys("developer");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Data added Successfully", txt);
	}

	@Test
	void testfailure() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("View Alumni")).click();
		driver.findElement(By.linkText("Add +")).click();
		driver.findElement(By.name("aname")).click();
		driver.findElement(By.name("aname")).sendKeys("divya");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Please enter dept !!!", txt);
	}

	@Test
	void testfailure2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("View Alumni")).click();
		driver.findElement(By.linkText("Add +")).click();
		driver.findElement(By.name("aname")).click();
		driver.findElement(By.name("aname")).sendKeys("divya");
		driver.findElement(By.name("dept")).click();
		driver.findElement(By.name("dept")).sendKeys("Cs");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Please enter graduation year!!!", txt);
	}

	@Test
	void testfailure3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("View Alumni")).click();
		driver.findElement(By.linkText("Add +")).click();
		driver.findElement(By.name("aname")).click();
		driver.findElement(By.name("aname")).sendKeys("divya");
		driver.findElement(By.name("dept")).click();
		driver.findElement(By.name("dept")).sendKeys("Cs");
		driver.findElement(By.name("passedoutyear")).click();
		driver.findElement(By.name("passedoutyear")).sendKeys("2022");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Please Enter the status!!!", txt);
	}
}
