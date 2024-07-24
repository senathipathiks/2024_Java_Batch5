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
public class SignUpTest {
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
  public void signUp() {
    // Test name: SignUp
    // Step # | name | target | value
    // 1 | open | http://localhost:3000/ | 
    driver.get("http://localhost:3000/");
    // 2 | setWindowSize | 1552x832 | 
    driver.manage().window().setSize(new Dimension(1552, 832));
    // 3 | click | css=.flex > button | 
    driver.findElement(By.cssSelector(".flex > button")).click();
    // 4 | click | name=name | 
    driver.findElement(By.name("name")).click();
    // 5 | type | name=name | gokul
    driver.findElement(By.name("name")).sendKeys("gokul");
    // 6 | click | name=type | 
    driver.findElement(By.name("type")).click();
    // 7 | type | name=type | donator
    driver.findElement(By.name("type")).sendKeys("donator");
    // 8 | click | name=email | 
    driver.findElement(By.name("email")).click();
    // 9 | type | name=email | gokul@gmail.com
    driver.findElement(By.name("email")).sendKeys("gokul@gmail.com");
    // 10 | click | name=password | 
    driver.findElement(By.name("password")).click();
    // 11 | type | name=password | 123
    driver.findElement(By.name("password")).sendKeys("123");
    // 12 | click | css=.text-white | 
    driver.findElement(By.cssSelector(".text-white")).click();
  }
}
