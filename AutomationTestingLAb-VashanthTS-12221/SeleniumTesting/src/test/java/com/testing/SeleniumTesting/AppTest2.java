package com.testing.SeleniumTesting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest2 {
//	@Test
//	void test() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
//		assertEquals("Google",driver.getTitle());
//	}
	  private WebDriver driver;
	
	  @BeforeEach
	  public void setUp() {
	    driver = new ChromeDriver();
	   
	  
	  }
	  @AfterEach
	  public void tearDown() {
		  
	    driver.quit();
	  }
//   @Test 
//   @Order(1)
//   void testSignup() throws InterruptedException {
//	   WebDriver driver = new ChromeDriver();
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().maximize();
//	    driver.findElement(By.linkText("SignUp")).click();
//	 
//	    driver.findElement(By.id("uname")).sendKeys("vasi");
//	  
//	    driver.findElement(By.id("email") ).sendKeys("vasi@gmail.com");
//	   
//	    driver.findElement(By.id("pwd") ).sendKeys("vasi@123");
//	    
//	    driver.findElement(By.id("btn")).submit();
//	    
//	    Thread.sleep(2000);
//	  assertEquals("Registered Successfully",driver.switchTo().alert().getText() );
//	  try {
//          Alert alert = driver.switchTo().alert();
//          String alertText = alert.getText();
//          assertEquals("Registered Successfully", alertText);
//          alert.dismiss(); // Dismiss the alert
//      } catch (org.openqa.selenium.UnhandledAlertException ex) {
//          // If the alert is not handled properly, it may throw UnhandledAlertException
//          System.out.println("UnhandledAlertException caught: " + ex.getMessage());
//      }

      // Optionally assert other things after dismissing the alert
//      assertEquals("Registered Successfully", "Registered Successfully");
  
//   }
//	@Test
//	@Order(2)
//	void  testlogin() {
//		    WebDriver driver = new ChromeDriver();
//		
//		    driver.get("http://localhost:3000/");
//		    driver.manage().window().setSize(new Dimension(1552, 832));
//		    driver.findElement(By.linkText("Login")).click();
//		    driver.findElement(By.name("email")).click();
//		    driver.findElement(By.name("email")).sendKeys("raj@gmail.com");
//		    driver.findElement(By.name("password")).click();
//		    driver.findElement(By.name("password")).sendKeys("Raja@123");
//		    driver.findElement(By.cssSelector(".text-white")).click();
//		    assertEquals("Login Success!!",driver.switchTo().alert().getText());
//
//
//
//	}
//	
//	 @Test 
//	 @Order(3)
//	   void testSignupfail() {
//		     WebDriver driver = new ChromeDriver();
//			
//			driver.get("http://localhost:3000/");
//		    driver.manage().window().maximize();
//		    driver.findElement(By.linkText("SignUp")).click();
//		    driver.findElement(By.id("uname")).click();
//		    driver.findElement(By.id("uname")).sendKeys("Ravi");
//		    driver.findElement(By.id("email") ).click();
//		    driver.findElement(By.id("email") ).sendKeys("ravi@gmail.com");
//		    driver.findElement(By.id("pwd") ).click();
//		    driver.findElement(By.id("pwd") ).sendKeys("Rav123");
//		    driver.findElement(By.id("btn") ).click();
//		    driver.findElement(By.id("btn")).submit();
//		   
//		    assertSame(("Password  Cannot be empty value !!  It Should Contain atleast 8 characters!!!"),driver.switchTo().alert().getText());

//		    try {
//	            Alert alert = driver.switchTo().alert();
//	            String alertText = alert.getText();
//	            assertEquals("Password  Cannot be empty value !!  It Should Contain atleast 8 characters!!!", alertText);
//	            alert.accept(); // Dismiss the alert
//	        } catch (org.openqa.selenium.UnhandledAlertException ex) {
//	            // If the alert is not handled properly, it may throw UnhandledAlertException
//	            System.out.println("UnhandledAlertException caught: " + ex.getMessage());
//	        }
//
//	        // Optionally assert other things after dismissing the alert
//	        assertEquals("Password  Cannot be empty value !!  It Should Contain atleast 8 characters!!!", "Password  Cannot be empty value !!  It Should Contain atleast 8 characters!!!");
//	    
//	 }
////	
//	  @Test
//		@Order(5)
//		void  testloginfail() throws InterruptedException {
////			    WebDriver driver = new ChromeDriver();
//			    
//			    driver.get("http://localhost:3000/");
//			    driver.manage().window().setSize(new Dimension(1552, 832));
//			    driver.findElement(By.linkText("Login")).click();
//			    driver.findElement(By.name("email")).click();
//			    driver.findElement(By.name("email")).sendKeys("raju@gmail.com");
//			    driver.findElement(By.name("password")).click();
//			    driver.findElement(By.name("password")).sendKeys("Raju@123");
//			    driver.findElement(By.cssSelector(".text-white")).click();
//			   
//			    assertEquals("Invalid credentials. Please try again.",driver.switchTo().alert().getText());
//			    Thread.sleep(10000);
//	
//	
//		} 
	  
//	  @Test
//	  void testAddMatchMaker() {
//		  
//		  WebDriver driver = new ChromeDriver();
//		  driver.get("http://localhost:3000/");
//		    driver.manage().window().maximize();
//		    driver.findElement(By.linkText("Features")).click();
//		    driver.findElement(By.linkText("Match Makers")).click();
//		    driver.findElement(By.id("add")).click();
//		    driver.findElement(By.name("mname")).click();
//		  driver.findElement(By.name("mname")).sendKeys("Nirmala");
//		  driver.findElement(By.name("addr")).click();
//		  driver.findElement(By.name("addr")).sendKeys("Therkuvasal,Madurai-08");
//		  driver.findElement(By.name("cmobile")).click();
//		  driver.findElement(By.name("cmobile")).sendKeys("9012345678");
//		  driver.findElement(By.id("submit")).click();
//		  driver.findElement(By.id("submit")).submit();
//		  assertEquals("Data added Successfully", driver.switchTo().alert().getText());
//	  }
	  
//	  @Test
//	  void testAddUser() throws InterruptedException {
//		  
//		  WebDriver driver = new ChromeDriver();
//		  driver.get("http://localhost:3000/");
//		    driver.manage().window().maximize();
//		    driver.findElement(By.linkText("Features")).click();
//		    driver.findElement(By.linkText("Our Customers")).click();
//		    driver.findElement(By.linkText("Add +")).click();
//		  driver.findElement(By.name("uname")).sendKeys("Seetha");
//		  driver.findElement(By.name("actype")).sendKeys("Bride");
//		  driver.findElement(By.name("addr")).sendKeys("Therkuvasal,Madurai-08");
//		  driver.findElement(By.name("age")).sendKeys("25");
//		
//		  driver.findElement(By.name("sal")).sendKeys("25000"); 
//		  
//		  driver.findElement(By.name("job")).sendKeys("Teacher");  
//		  driver.findElement(By.name("pay")).sendKeys("Monthly");
//
//		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
//		 
//	  	 driver.findElement(By.name("sts")).sendKeys("Single");
//		 driver.findElement(By.xpath("//option[. = '9']")).click();
//		  driver.findElement(By.id("submit")).submit();
//		  Thread.sleep(2000);
//		  assertEquals("Data added Successfully", driver.switchTo().alert().getText());
//		  driver.switchTo().alert().accept();
//	  }
	  
//	  @Test
//	  void testEditMatchMaker() throws InterruptedException {
//		  
//		  WebDriver driver = new ChromeDriver();
//		  driver.get("http://localhost:3000/");
//		    driver.manage().window().maximize();
//
//		    
//		    driver.get("http://localhost:3000/view");
//		    driver.findElement(By.name("update10")).click();
//		    driver.findElement(By.name("cmobile")).clear();
//		    driver.findElement(By.name("cmobile")).sendKeys("9842697239");
//	        
////		  
//		  driver.findElement(By.id("submit")).submit();
//////		
//		  Thread.sleep(2000);
//		     assertEquals("Updated Successfully", driver.switchTo().alert().getText());
//		  	  } 
//	  
	  
}
