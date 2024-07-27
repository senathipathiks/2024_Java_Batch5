package testing.seleniumeg4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase extends TestCase {

	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3001/");
	    driver.manage().window().setSize(new Dimension(1552, 832));
	    driver.findElement(By.cssSelector(".border")).click();
	    driver.findElement(By.linkText("Apply for Leave")).click();
	    driver.findElement(By.name("emp_name")).click();
	    driver.findElement(By.name("emp_name")).sendKeys("Kiruthi");
	    driver.findElement(By.name("days")).click();
	    driver.findElement(By.name("days")).sendKeys("1");
	    driver.findElement(By.name("reason")).click();
	    driver.findElement(By.name("reason")).sendKeys("Fever");
	    driver.findElement(By.id("selectId")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("selectId"));
	      dropdown.findElement(By.xpath("//option[. = 'Munish']")).click();
	    }
	    driver.findElement(By.cssSelector(".btn")).click();
	  }

		
}


