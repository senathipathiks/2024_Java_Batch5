package com.supraja.AlumniSelenium;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Viewevent {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("Event\'s List")).click();
	}

	@Test
	void testregsuccess() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("ninja");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("ninja@gmail.com");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("nikaa");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("nnn");
		driver.findElement(By.cssSelector(".btn-info")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Registration Successful!", txt);

	}

	@Test
	void testfailure1() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("ninja");
		driver.findElement(By.cssSelector(".btn-info")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Enter Valid email!!", txt);

	}

	@Test
	void testfailure2() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("ninja");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("ninja@gmail.com");
		driver.findElement(By.cssSelector(".btn-info")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Enter Valid username!!", txt);

	}

	@Test
	void testfailure3() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 807));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("ninja");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("ninja@gmail.com");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("nikaa");
		driver.findElement(By.cssSelector(".btn-info")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Enter Valid password!!", txt);

	}

}
