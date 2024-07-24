package com.velan.Selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class UpdateAttendanceTest {

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {
	 driver = new ChromeDriver();
	 js = (JavascriptExecutor) driver;
	 vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
	 driver.quit();
	}
	
	@Test
	public void updateAttendanceSuccess() {
	 driver.get("http://localhost:3000/updatequiz/44");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-22");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Monday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Absent");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Updated Successfully", "Data Updated Successfully");
	}
	
	@Test
	public void updateAttendanceFailure1() {
	 driver.get("http://localhost:3000/updatequiz/44");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Monday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Absent");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}
	
	@Test
	public void updateAttendanceFailure2() {
	 driver.get("http://localhost:3000/updatequiz/44");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-22");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("Absent");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}
	
	@Test
	public void updateAttendanceFailure3() {
	 driver.get("http://localhost:3000/updatequiz/44");
	 driver.manage().window().setSize(new Dimension(1536, 815));
	 driver.findElement(By.name("date")).click();
	 driver.findElement(By.name("date")).sendKeys("2024-07-22");
	 driver.findElement(By.name("day")).click();
	 driver.findElement(By.name("day")).sendKeys("Monday");
	 driver.findElement(By.name("attend")).click();
	 driver.findElement(By.name("attend")).sendKeys("");
	 driver.findElement(By.name("submit")).click();
	 assertEquals("Data Not Updated", "Data Not Updated");
	}

}
