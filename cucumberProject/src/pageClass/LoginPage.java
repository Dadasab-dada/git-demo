package pageClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openURL() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com/");
	}

	public void enterUserName() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("abc123");
	}
	public void clickloginButton() {
		System.out.println("Login Button Clicked");
	}
	public void verifyLogin() {
		System.out.println("Verified Login");
	}
}
