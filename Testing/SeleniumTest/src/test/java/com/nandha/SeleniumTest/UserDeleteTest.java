package com.nandha.SeleniumTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDeleteTest {

	private WebDriver driver;

	@AfterEach
	void close() {
		driver.quit();
	}

	@Test
	void testDeleteUser() throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://localhost:3000/login");

		WebElement usernameInput = driver.findElement(By.name("name"));
		usernameInput.sendKeys("Nandhakumaran");

		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys("123");

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

		WebElement donatorDetailsButton = driver.findElement(By.xpath("//button[contains(text(),'Donator Details')]"));
		donatorDetailsButton.click();

		WebElement donatorDeleteButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[4]/td[8]/button"));
		donatorDeleteButton.click();

		Thread.sleep(5000);
		assertEquals("Do you want to delete?", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		Thread.sleep(5000);
		assertEquals("Record has been deleted", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		Thread.sleep(5000);

	}

}
