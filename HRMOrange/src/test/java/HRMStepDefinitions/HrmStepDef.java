package HRMStepDefinitions;

import org.openqa.selenium.WebDriver;

import HRMLogin.AdminRegression;
import HRMLogin.HrmLoginClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmStepDef {

	WebDriver driver;
	private HrmLoginClass login;
	private AdminRegression admin;
	
	
	@Before
	public void setUp() {
		login = new HrmLoginClass();

	}

	@Given("user launch browser")
	public void user_launch_browser() throws Exception {
		//login = new HrmLoginClass();
		login.userlaunchBrowser();
	}

	@Given("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws Exception {
		// login = new HrmLoginClass();
		login.enterValidCredentials(username, password);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws Exception {
		// By click_login = By.xpath("//button[@type='submit']");
		// login = new HrmLoginClass();

		login.clickLogin();

	}
	
	@Given("user click on admin")
	public void user_click_on_admin() throws Exception {
		if (login != null) {
            login.userclickonAdmin();
        } else {
            throw new NullPointerException("HrmLoginClass not initialized.");
        }
			//login.userclickonAdmin();
        
		//login.userclickonAdmin();
	}

	@Then("user navigate to dashboard")
	public void user_navigate_to_dashboard() throws Exception {
		login.userreturnBackToDashBoard();
	}
	

}
