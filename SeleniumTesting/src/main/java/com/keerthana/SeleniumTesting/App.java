package com.keerthana.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//       WebDriver driver=new ChromeDriver();
//       driver.get("http://www.google.com");
//       System.out.println(driver.getCurrentUrl());
//       System.out.println(driver.getTitle());
////       driver.switchTo().alert().accept();
//      
//       driver.manage().window().maximize();
//       driver.get("http://www.google.com");
//       driver.findElement(By.name("q")).sendKeys("selenium");
//       driver.findElement(By.name("btnK")).submit();
//       System.out.println(driver.getCurrentUrl());
//       System.out.println(driver.findElement(By.name("q")).getText());
//       driver.navigate().to("http://sangam.relevantz.com");
//       driver.findElement(By.name("username")).sendKeys("keerthana.prabu");
//       driver.findElement(By.name("password")).sendKeys("Annanagar@12345");
//       driver.findElement(By.name("submit")).submit();
    	
    	// Generated by Selenium IDE

    	
//    	  private Map<String, Object> vars;
//    	  JavascriptExecutor js;
//    	  @Before
//    	  public void setUp() {
//    	    driver = new ChromeDriver();
//    	    js = (JavascriptExecutor) driver;
//    	    vars = new HashMap<String, Object>();
//    	  }
//    	  @After
//    	  public void tearDown() {
//    	    driver.quit();
//    	  }
public class App {
	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
    	 
    	    driver.get("https://www.google.com/");
//    	    driver.manage().window().setSize(new Dimension(1536, 824));
    	    driver.findElement(By.name("q")).sendKeys("selenium");
          driver.findElement(By.name("btnK")).submit();
    	  
    	  
    	}
    	}
       
       
       
    
