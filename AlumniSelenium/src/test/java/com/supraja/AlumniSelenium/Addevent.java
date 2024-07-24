package com.supraja.AlumniSelenium;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

class Addevent {

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
		driver.get("http://localhost:3000/create");
		driver.manage().window().setSize(new Dimension(1536, 808));
		driver.findElement(By.name("ename")).click();
		driver.findElement(By.name("ename")).sendKeys("techfest");
		driver.findElement(By.name("fundallocation")).click();
		driver.findElement(By.name("fundallocation")).sendKeys("7000");
		driver.findElement(By.name("aid")).click();
		{
			WebElement dropdown = driver.findElement(By.name("aid"));
			dropdown.findElement(By.xpath("//option[. = '24']")).click();
		}
		driver.findElement(By.cssSelector(".btn")).click();

	}

	@Test
	void testfailure() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 811));
		driver.findElement(By.linkText("Event\'s List")).click();
		driver.findElement(By.linkText("Add +")).click();
		driver.findElement(By.name("ename")).click();
		driver.findElement(By.name("ename")).sendKeys("techh");
		driver.findElement(By.name("aid")).click();
		{
			WebElement dropdown = driver.findElement(By.name("aid"));
			dropdown.findElement(By.xpath("//option[. = '22']")).click();
		}
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Enter fund ", txt);
	}

	@Test
	void testfailure2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 811));
		driver.findElement(By.linkText("Event\'s List")).click();
		driver.findElement(By.linkText("Add +")).click();
		driver.findElement(By.name("fundallocation")).click();
		driver.findElement(By.name("fundallocation")).sendKeys("20000");
		driver.findElement(By.name("aid")).click();
		{
			WebElement dropdown = driver.findElement(By.name("aid"));
			dropdown.findElement(By.xpath("//option[. = '23']")).click();
		}
		driver.findElement(By.cssSelector(".btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Enter the Event name ", txt);
	}

}
