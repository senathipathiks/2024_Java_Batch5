package com.testing.SeleniumTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class DeleteTC {
	 
	WebDriver driver;
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  
	  
//	@Test
//	void Deletetest() throws InterruptedException {
//	  	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://localhost:3000/view");
//	    driver.findElement(By.name("delete11")).click();
//	    Thread.sleep(2000);
//	    driver.switchTo().alert().accept();
//	    
//	    WebDriverWait waitDriver = new WebDriverWait(driver,Duration.ofSeconds(5));
//	    waitDriver.until(ExpectedConditions.alertIsPresent());
//	   
//	    assertEquals("record has deleted", driver.switchTo().alert().getText());
//	}
	  
//	  @Test
//		void DeleteUsertest() throws InterruptedException {
//		  	driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("http://localhost:3000/viewuser");
//		    driver.findElement(By.name("delete30")).click();
//		    Thread.sleep(2000);
//		    driver.switchTo().alert().accept();
//		    
//		    WebDriverWait waitDriver = new WebDriverWait(driver,Duration.ofSeconds(5));
//		    waitDriver.until(ExpectedConditions.alertIsPresent());
//		   
//		    assertEquals("record has deleted", driver.switchTo().alert().getText());
//		}

}
