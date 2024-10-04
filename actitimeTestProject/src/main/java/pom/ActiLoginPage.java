package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement enter_user;
	
	@FindBy(xpath = "//input[@name='pwd']")
	WebElement enter_pass;
	
	@FindBy(xpath = "//input[@name='remember']")
	WebElement click_checkbox;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	WebElement click_login;
	
	
	WebDriver driver;
	
	public ActiLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entervalicredentials() throws Exception {
		enter_user.sendKeys("nimbalakar.dadasab@gmail.com");
		Thread.sleep(2000);
		enter_pass.sendKeys("Dada@1993");
	}
	
	public void userclickcheckbox() {
		click_checkbox.click();
	}
	
	public void clickonlogin() {
		click_login.click();
	}

}
