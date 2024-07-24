package com.velan.Selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.*;


public class AddAttendanceTest {
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
public void addAttendanceSuccess() {
 driver.get("http://localhost:3000/addAttend");
 driver.manage().window().setSize(new Dimension(1536, 815));
 driver.findElement(By.name("date")).click();
 driver.findElement(By.name("date")).sendKeys("2024-07-22");
 driver.findElement(By.name("day")).click();
 driver.findElement(By.name("day")).sendKeys("Monday");
 driver.findElement(By.name("attend")).click();
 driver.findElement(By.name("attend")).sendKeys("Absent");
 driver.findElement(By.name("submit")).click();
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	String txt = alert.getText();
	System.out.println(txt);
	alert.accept();
    assertEquals("Data added Successfully", txt);
}

@Test
public void addAttendanceFailure1() {
 driver.get("http://localhost:3000/addAttend");
 driver.manage().window().setSize(new Dimension(1536, 815));
 driver.findElement(By.name("date")).click();
 driver.findElement(By.name("date")).sendKeys("");
 driver.findElement(By.name("day")).click();
 driver.findElement(By.name("day")).sendKeys("Tuesday");
 driver.findElement(By.name("attend")).click();
 driver.findElement(By.name("attend")).sendKeys("Present");
 driver.findElement(By.name("submit")).click();
 assertEquals("Data Not Added", "Data Not Added");
}

@Test
public void addAttendanceFailure2() {
 driver.get("http://localhost:3000/addAttend");
 driver.manage().window().setSize(new Dimension(1536, 815));
 driver.findElement(By.name("date")).click();
 driver.findElement(By.name("date")).sendKeys("2024-07-22");
 driver.findElement(By.name("day")).click();
 driver.findElement(By.name("day")).sendKeys("");
 driver.findElement(By.name("attend")).click();
 driver.findElement(By.name("attend")).sendKeys("Present");
 driver.findElement(By.name("submit")).click();
 assertEquals("Data Not Added", "Data Not Added");
}

@Test
public void addAttendanceFailure3() {
 driver.get("http://localhost:3000/addAttend");
 driver.manage().window().setSize(new Dimension(1536, 815));
 driver.findElement(By.name("date")).click();
 driver.findElement(By.name("date")).sendKeys("2024-07-23");
 driver.findElement(By.name("day")).click();
 driver.findElement(By.name("day")).sendKeys("Tuesday");
 driver.findElement(By.name("attend")).click();
 driver.findElement(By.name("attend")).sendKeys("");
 driver.findElement(By.name("submit")).click();
 assertEquals("Data Not Added", "Data Not Added");
}



}

