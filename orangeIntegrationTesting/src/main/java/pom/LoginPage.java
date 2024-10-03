package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement txt_user;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_login;
	
	
	
	//constructor
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterValidaCredentilas(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		txt_user.sendKeys("Admin");
		Thread.sleep(2000);
		txt_pass.sendKeys("admin123");
		
	}
	
	public void clickloginButton() throws InterruptedException {
		Thread.sleep(2000);
		click_login.click();
	}
	
	
}
