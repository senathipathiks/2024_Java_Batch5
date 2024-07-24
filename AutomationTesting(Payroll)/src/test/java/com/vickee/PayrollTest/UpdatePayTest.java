package com.vickee.PayrollTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class UpdatePayTest {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/updatepayroll/2");
		driver.findElement(By.name("basic")).clear();
		driver.findElement(By.name("basic")).sendKeys("34000");
		driver.findElement(By.name("hra")).clear();
		driver.findElement(By.name("hra")).sendKeys("1000");
		driver.findElement(By.name("da")).clear();
		driver.findElement(By.name("da")).sendKeys("1000");
		driver.findElement(By.name("pf")).clear();
		driver.findElement(By.name("pf")).sendKeys("1000");
		driver.findElement(By.name("ctc")).clear();
		driver.findElement(By.name("ctc")).sendKeys("37000");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Payroll Updated Successfully", txt);
	}

}
