package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ActiLoginPage;

public class ActiStepDefinition {
	
	WebDriver driver;
	ActiLoginPage login;
	
	@Given("user launch browser")
	public void user_launch_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver=new EdgeDriver();
		driver.manage().window().maximize();	
	}

	@And("user navigate to login page")
	public void user_navigate_to_login_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://online.actitime.com/na14/login.do");
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("----User is on Login Page-----");
	}

	@And("^user enter valid username(.*) and password(.*)$")
	public void user_enter_valid_username_and_password(String username, String password) throws Exception {
		login=new ActiLoginPage(driver);
		login.entervalicredentials();
	}

	@And("user click on keep loged in check box")
	public void user_click_on_keep_loged_in_check_box() {
		login.userclickcheckbox();
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickonlogin();
	}

	@And("user should be navigate to Dashboard")
	public void user_should_be_navigate_to_dashboard() {
		System.out.println("---User is on Actitime DashBoard");
	}




}
