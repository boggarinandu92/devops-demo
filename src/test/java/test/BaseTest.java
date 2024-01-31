package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	static WebDriver driver;
	
@BeforeTest
public void beforeTest() {
	//open the browser & url
	//System.setProperty("Webdriver.chrome.driver", "..\\eclipse-workspace\\devops-demo\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
}
@AfterTest
public void afterTest() {
	//quit the browser
	driver.quit();
	
}
}
