package com.vickee.PayrollTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddPayrollTest {

	@Test
	void testAddPayroll1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/createpayroll");
		driver.findElement(By.name("basic")).sendKeys("50000");
		driver.findElement(By.name("hra")).sendKeys("1000");
		driver.findElement(By.name("da")).sendKeys("1000");
		driver.findElement(By.name("pf")).sendKeys("5000");
		driver.findElement(By.name("ctc")).sendKeys("57000");
		driver.findElement(By.id("submit")).submit();
		assertSame("Data added Successfully","Data added Successfully");
	}
	
	@Test
	void testAddPayroll2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/createpayroll");
		driver.findElement(By.name("basic")).sendKeys("50000");
		driver.findElement(By.name("hra")).sendKeys("1000");
		driver.findElement(By.name("da")).sendKeys("1000");
		driver.findElement(By.name("ctc")).sendKeys("57000");
		driver.findElement(By.id("submit")).submit();
		assertSame("Please enter valid input","Please enter valid input");
	}
	
	@Test
	void testAddPayroll3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/createpayroll");
		driver.findElement(By.name("basic")).sendKeys("40000");
		driver.findElement(By.name("hra")).sendKeys("1000");
		driver.findElement(By.name("da")).sendKeys("1000");
		driver.findElement(By.name("pf")).sendKeys("5000");
		driver.findElement(By.name("ctc")).sendKeys("47000");
		driver.findElement(By.id("submit")).submit();
		assertSame("Data added Successfully","Data added Successfully");
	}
	
	@Test
	void testAddPayroll4() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/createpayroll");
		driver.findElement(By.name("basic")).sendKeys("50000");
		driver.findElement(By.name("da")).sendKeys("1000");
		driver.findElement(By.name("pf")).sendKeys("5000");
		driver.findElement(By.name("ctc")).sendKeys("57000");
		driver.findElement(By.id("submit")).submit();
		assertSame("Please enter valid input","Please enter valid input");
	}

}
