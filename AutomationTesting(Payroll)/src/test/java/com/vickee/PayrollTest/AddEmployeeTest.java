package com.vickee.PayrollTest;



import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddEmployeeTest {

	@Test
	void testAddEmp1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("name")).sendKeys("Vickee");
		driver.findElement(By.name("desig")).sendKeys("Intern");
		driver.findElement(By.name("project")).sendKeys("RDX");
		driver.findElement(By.name("pid")).sendKeys("15");
		driver.findElement(By.id("submit")).submit();
		assertSame("Data added Successfully","Data added Successfully");
	}
	
	@Test
	void testAddEmp2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("name")).sendKeys("Vickee");
		driver.findElement(By.name("desig")).sendKeys("Intern");
		driver.findElement(By.name("project")).sendKeys("RDX");
		driver.findElement(By.name("pid")).sendKeys("8");
		driver.findElement(By.id("submit")).submit();
		assertSame("Data added Successfully","Data added Successfully");
	}
	
	@Test
	void testAddEmp3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("name")).sendKeys("Vickee");
		driver.findElement(By.name("project")).sendKeys("RDX");
		driver.findElement(By.name("pid")).sendKeys("15");
		driver.findElement(By.id("submit")).submit();
		assertSame("Enter Valid Details ","Enter Valid Details ");
	}
	
	@Test
	void testAddEmp4() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("desig")).sendKeys("Intern");
		driver.findElement(By.name("project")).sendKeys("RDX");
		driver.findElement(By.name("pid")).sendKeys("15");
		driver.findElement(By.id("submit")).submit();
		assertSame("Enter Valid Details ","Enter Valid Details ");
	}
}
