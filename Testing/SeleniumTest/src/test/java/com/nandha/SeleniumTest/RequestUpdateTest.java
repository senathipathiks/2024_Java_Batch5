package com.nandha.SeleniumTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestUpdateTest {

	private WebDriver driver;

	@BeforeEach
	void start() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://localhost:3000/login");

		WebElement usernameInput = driver.findElement(By.name("name"));
		usernameInput.sendKeys("nandha");

		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys("nandha123");

		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.submit();

		Thread.sleep(5000);

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("http://localhost:3000/main")) {
			System.out.println("Positive login test passed for employee!");
		} else if (currentUrl.equals("http://localhost:3000/usermain")) {
			System.out.println("Positive login test passed for donator!");
		} else {
			System.out.println("Positive login test failed. Unexpected redirection.");
		}

		WebElement donatorDetailsButton = driver.findElement(By.xpath("//button[contains(text(),'Handle Requests')]"));
		donatorDetailsButton.click();
	}

	@AfterEach
	void close() {
		driver.quit();
	}

	@Test
	void testUpdateRequestValid() throws InterruptedException {

		WebElement requestUpdateButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[1]/td[9]/a/button"));
		requestUpdateButton.click();

		driver.findElement(By.name("status")).clear();
		WebElement statusField = driver.findElement(By.name("status"));
		statusField.sendKeys("Pending");

		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"edit\"]/div/form/button"));
		submitButton.submit();

		Thread.sleep(5000);

		assertEquals("Data Updated Successfully", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);

	}

}
