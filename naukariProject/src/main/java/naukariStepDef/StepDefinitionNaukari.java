package naukariStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import naukariLogin.LoginPageNaukari;

public class StepDefinitionNaukari extends LoginPageNaukari  {
	
	//private LoginPageNaukari login;
	
	@Given("User launch the website")
	public void user_launch_the_website() {
		userLaunchWebSite();
	    
	}
	
	@When("user click on the login")
	public void user_click_on_the_login() throws Exception {
		userclicklogin();
	    
	}

	@When("user enter valida username")
	public void user_enter_valida_username() throws Exception {
		enteruserName();
	}

	@When("user enter valida password")
	public void user_enter_valida_password() throws Exception {
		enteruserPass();
	}

	@Then("user click on loginButton successfully")
	public void user_click_on_login_button_successfully() throws Exception {
		clickLoginButton();
	}

}
