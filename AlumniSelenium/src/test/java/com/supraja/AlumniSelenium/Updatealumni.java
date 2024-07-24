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

class Updatealumni {

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
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("View Alumni")).click();
		driver.findElement(By.linkText("Update")).click();
		driver.findElement(By.name("aname")).click();
		driver.findElement(By.name("aname")).sendKeys("Supraja Balakumar");
		driver.findElement(By.name("fundallocation")).click();
		driver.findElement(By.name("fundallocation")).sendKeys("10000");
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Alumni Updated Successfully", txt);
	}

	@Test
	void testfailure() {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Alumni Updated Successfully", txt);
	}

}
