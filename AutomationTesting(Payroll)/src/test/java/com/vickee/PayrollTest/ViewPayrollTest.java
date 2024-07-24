package com.vickee.PayrollTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ViewPayrollTest {
	
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
	void testViewPay() {
		driver.get("http://localhost:3000/viewpayroll");
		driver.findElement(By.id("app2"));
		assertEquals("Payroll Management System","Payroll Management System");
	}
	
	@Test
	void testViewPay1() {
		driver.get("http://localhost:3000/viewpayroll");
		driver.findElement(By.id("add"));
		assertEquals("Add","Add");
	}
	
	
	

}
