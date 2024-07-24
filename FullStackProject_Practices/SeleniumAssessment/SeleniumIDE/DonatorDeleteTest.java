// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DonatorDeleteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void donatorDelete() {
    // Test name: DonatorDelete
    // Step # | name | target | value
    // 1 | open | http://localhost:3000/login | 
    driver.get("http://localhost:3000/login");
    // 2 | setWindowSize | 786x816 | 
    driver.manage().window().setSize(new Dimension(786, 816));
    // 3 | click | id=username | 
    driver.findElement(By.id("username")).click();
    // 4 | type | id=username | gokul
    driver.findElement(By.id("username")).sendKeys("gokul");
    // 5 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 6 | type | id=password | 123
    driver.findElement(By.id("password")).sendKeys("123");
    // 7 | click | css=.text-white | 
    driver.findElement(By.cssSelector(".text-white")).click();
    // 8 | click | css=.text-gray-1000:nth-child(2) button | 
    driver.findElement(By.cssSelector(".text-gray-1000:nth-child(2) button")).click();
    // 10 | click | css=.sc-dcJtft:nth-child(6) > .sc-iGgVNO > .mr-4 > .w-5 | 
    driver.findElement(By.cssSelector(".sc-dcJtft:nth-child(6) > .sc-iGgVNO > .mr-4 > .w-5")).click();
    // 11 | webdriverChooseOkOnVisibleConfirmation |  | 
    driver.switchTo().alert().accept();
  }
}
