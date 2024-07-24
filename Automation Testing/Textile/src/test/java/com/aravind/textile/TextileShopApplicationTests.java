//package com.aravind.textile;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Keys;
//import java.util.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//@SpringBootTest
//public class TextileShopApplicationTests {
//  private WebDriver driver;
//  private Map<String, Object> vars;
//  JavascriptExecutor js;
//  @Before
//  public void setUp() throws MalformedURLException {
//    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
//  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
//  @Test
//  public void signup() {
//    driver.get("http://localhost:3000/");
//    driver.manage().window().setSize(new Dimension(1051, 798));
//    driver.findElement(By.cssSelector(".nav-item:nth-child(1) > .nav-link > a")).click();
//    driver.findElement(By.name("username")).click();
//    driver.findElement(By.name("username")).sendKeys("buvan");
//    driver.findElement(By.name("name")).click();
//    driver.findElement(By.name("name")).sendKeys("buvan");
//    driver.findElement(By.name("email")).click();
//    driver.findElement(By.name("email")).sendKeys("kumar@gmail.com");
//    driver.findElement(By.name("password")).click();
//    driver.findElement(By.name("password")).sendKeys("123");
//    driver.findElement(By.name("cpass")).click();
//    driver.findElement(By.name("cpass")).sendKeys("123");
//    driver.findElement(By.name("sign-up")).click();
//    assertThat(driver.switchTo().alert().getText(), is("user added"));
//  }
//}
