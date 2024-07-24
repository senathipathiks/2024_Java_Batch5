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
class ViewEmployeeTest {
	
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
	void testHead() {
		driver.get("http://localhost:3000/viewemployee");
		driver.findElement(By.id("app2"));
		assertEquals("Payroll Management System","Payroll Management System");
	}
	
	@Test
	void testHead1() {
		driver.get("http://localhost:3000/viewemployee");
		driver.findElement(By.id("add"));
		assertEquals("Add","Add");
	}
	
	@Test
	void testHead2() {
		driver.get("http://localhost:3000/viewemployee");
		driver.findElement(By.id("view"));
		assertEquals("View","View");
	}
	
}
