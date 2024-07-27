package testing.seleniumeg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase extends TestCase {

	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3001");
        
        driver.findElement(By.id("login")).click();
//        driver.findElement(By.name("username")).sendKeys("gokul.marimuthu");
//        driver.findElement(By.name("password")).sendKeys("Password is not safe07");
//        driver.findElement(By.name("submit")).submit();
//        
//        driver.findElement(By.className("user-image")).click();
//        driver.findElement(By.className("pull-right")).click();
	}

}
