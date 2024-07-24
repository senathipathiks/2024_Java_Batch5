package com.supraja.AlumniSelenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.net.MalformedURLException;

class Updateevent {

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
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 808));
		driver.findElement(By.linkText("Event\'s List")).click();
		driver.findElement(By.linkText("Update")).click();
		driver.findElement(By.name("ename")).click();
		driver.findElement(By.name("ename")).sendKeys("techyfesttoo");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Event Updated Successfully!", txt);
	}

}
