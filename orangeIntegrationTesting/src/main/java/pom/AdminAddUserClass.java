package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddUserClass {

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	WebElement click_role;
	@FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
	WebElement select_role;
	
//	@FindBy(xpath = "//span[@data-v-08362132='']")
//	WebElement employe_name;
//	@FindBy(xpath = "(//span[@data-v-08362132=''])[1]")
//	WebElement employe_click;
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	WebElement click_status;

	@FindBy(xpath = "(//div[@role=\"option\"])[2]")
	WebElement select_status;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement user_name;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement new_pass;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement confirm_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_save;
	
	WebDriver driver;
	
	public AdminAddUserClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonuserroledropdown() throws InterruptedException {
		Thread.sleep(2000);
		click_role.click();
	}
	
	public void selectdropdownlistforrole() throws InterruptedException {
		Thread.sleep(2000);
		select_role.click();
	}
	
	public void enteremployename() throws InterruptedException {
		Thread.sleep(2000);
		//employe_name.sendKeys("JH");
		Thread.sleep(5000);
		//employe_click.click();

		
	}
	
	public void clickonstatusdropdown() throws InterruptedException {
		Thread.sleep(2000);
		click_status.click();
	}
	
	public void selectdropdownlistforstatus() throws InterruptedException {
		Thread.sleep(2000);
		select_status.click();
	}
	
	public void enterusername() throws InterruptedException {
		Thread.sleep(2000);
		user_name.sendKeys("Dadasab");
		
	}
	
	public void enternewpasswordandconfpassword() throws InterruptedException {
		Thread.sleep(2000);
		new_pass.sendKeys("Dada@1212");
		Thread.sleep(2000);
		confirm_pass.sendKeys("Dada@1212");
		
	}
	
	public void clickonsavebutton() throws InterruptedException {
		Thread.sleep(2000);
		click_save.click();
	}

}
