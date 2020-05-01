// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
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
public class PerfilTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @AfterEach
  public void setUp() {
    System.setProperty( "webdriver.chrome.driver", "C:\\Users\\pablo\\IdeaProjects\\ISST-20-TFG-0\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void perfil() {
    driver.get("http://localhost:3000/login");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.id("roomNumber")).sendKeys("2");
    driver.findElement(By.id("dni")).sendKeys("00000002A");
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.id("name")).sendKeys("Cambio");
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.id("name")).sendKeys("Prueba1");
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[4]")).click();
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[4]")).click();
    driver.findElement(By.cssSelector(".MuiButton-root")).click();
    driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
    driver.findElement(By.cssSelector(".NavigationBar-menuButton-4")).click();
  }
}
