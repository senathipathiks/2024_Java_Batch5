package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class DeleteMatchMaker {
	
	
	WebDriver driver = new ChromeDriver();
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  
	  
	@Test
	void Deletetest() throws InterruptedException {
		driver.get("http://localhost:3000/view");
		driver.manage().window().maximize();
		
	    driver.findElement(By.name("delete15")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    
	    WebDriverWait waitDriver = new WebDriverWait(driver,Duration.ofSeconds(5));
	    waitDriver.until(ExpectedConditions.alertIsPresent());
	   
	    assertEquals("record has deleted", driver.switchTo().alert().getText());
	}

}
