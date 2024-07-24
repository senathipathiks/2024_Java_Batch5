package com.testing.SeleniumTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateUser {
	WebDriver driver = new ChromeDriver();
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	@Test
	void UpdateUsertest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/viewuser");
	    driver.findElement(By.name("update28")).click();
	    driver.findElement(By.name("uname")).clear();
	    driver.findElement(By.name("uname")).sendKeys("Maddy_Madhan");
	    driver.findElement(By.id("submit")).submit();
//////	
	     Thread.sleep(2000);
	     assertEquals(" Updated Successfully", driver.switchTo().alert().getText());
	}

}
