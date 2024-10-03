package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminClass {
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement click_Admin;

	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement click_add;
	
	WebDriver driver;
	
	public AdminClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void userclickonAdminElement() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Admin element found!");
		click_Admin.click();
		  
	}
	
	public void userclickonADDButton() throws InterruptedException {
		Thread.sleep(2000);
		click_add.click();
	}
	
}
