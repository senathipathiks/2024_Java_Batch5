/**
 * 
 */
package com.vickee.PayrollTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HomePageTest {
	
	private WebDriver driver;
	
    @BeforeAll
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterAll
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeEach
    void goToHomePage() {
    	driver.get("http://localhost:3000/");
    }

	@Test
	void testNav1() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("nav1"));
		assertEquals("HOME","HOME");
	}
	
	@Test
	void testNav2() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("nav2"));
		assertEquals("ADDEMPLOYEE","ADDEMPLOYEE");
	}
	
	@Test
	void testNav3() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("nav3"));
		assertEquals("CREATEPAYROLL","CREATEPAYROLL");
	}
	
	@Test
	void testNav4() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("nav4"));
		assertEquals("VIEWPAYROLL","VIEWPAYROLL");
	}
	
	@Test
	void testNav5() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("nav5"));
		assertEquals("VIEWEMPLOYEE","VIEWEMPLOYEE");
	}
	
	@Test
	void testImage() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("logo"));
		assertEquals("MeeVickee","MeeVickee");
	}
	
	@Test
	void message1() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("intro"));
		assertEquals("Welcome!!!","Welcome!!!");
	}
	
	@Test
	void message2() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("service"));
		assertEquals("OUR SERVICES","OUR SERVICES");
	}
	
	@Test
	void message3() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("services"));
		assertEquals("OUR DOMAIN'S","OUR DOMAIN'S");
	}
	
	
	
}
