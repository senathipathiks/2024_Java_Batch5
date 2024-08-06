//package com.srienath.restapp;
//
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import java.time.Duration;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.Dimension;
//
//public class SeleniumTestingUser {
//  private WebDriver driver;
//
//  @Before
//  public void setUp() {
//    driver = new ChromeDriver();   
//  }
//  
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
// 
//  @Test
//  public void testCase001SignUp() {
//    driver.get("http://localhost:3000/");
//    driver.manage().window().setSize(new Dimension(1528, 816));
//    driver.findElement(By.name("userName")).click();
//    driver.findElement(By.name("userName")).sendKeys("Giri234");
//    driver.findElement(By.name("email")).click();
//    driver.findElement(By.name("email")).sendKeys("Giri234@gmail.com");
//    driver.findElement(By.name("password")).click();
//    driver.findElement(By.name("password")).sendKeys("Giri@23");
//    driver.findElement(By.cssSelector(".btton-primary")).click();
//
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.alertIsPresent());
//    Alert alert =driver.switchTo().alert();
//    String txt = alert.getText();
//	alert.accept();
//	assertEquals("Registered Successfully !!!", txt);
//  }
//  
//  @Test
//  public void testCase002Login() {
//    driver.get("http://localhost:3000/");
//    driver.manage().window().setSize(new Dimension(1528, 816));
//    driver.findElement(By.cssSelector(".btton-secondary")).click();
//    driver.findElement(By.name("email")).click();
//    driver.findElement(By.name("email")).sendKeys("Vaisakh234@gmail.com");
//    driver.findElement(By.name("password")).click();
//    driver.findElement(By.name("password")).sendKeys("Vaisakh@234");
//    driver.findElement(By.name("Sign in")).click();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.alertIsPresent());
//    Alert alert =driver.switchTo().alert();
//    String txt = alert.getText();
//	alert.accept();
//	assertEquals("Login Success !!!", txt);
//  }
//}
//
//
