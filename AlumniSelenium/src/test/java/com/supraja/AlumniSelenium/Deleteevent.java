package com.supraja.AlumniSelenium;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

class Deleteevent {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1536, 808));
		driver.findElement(By.linkText("Event\'s List")).click();
		driver.findElement(By.cssSelector("tr:nth-child(2) .ms-1")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("record has deleted", txt);
	}

}
