package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Login {

	WebDriver driver;
	public Login(WebDriver driverObj) {
		driver = driverObj;
	}
	public void loginWithCredentials(String username , String password) {
		Reporter.log("username = " +username);
		Reporter.log("password = " +password);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		email.clear();
		email.sendKeys("username");
		pass.clear();
		pass.sendKeys("password");
		loginBtn.click();
		}
}
