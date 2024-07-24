package com.vickee.PayrollTest;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class UpdateEmpTest {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/updateemployee/8");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("Vidhu");
		driver.findElement(By.name("desig")).clear();
		driver.findElement(By.name("desig")).sendKeys("Trainer");
		driver.findElement(By.name("project")).clear();
		driver.findElement(By.name("project")).sendKeys("RX");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Employee Updated Successfully", txt);
	}
}
