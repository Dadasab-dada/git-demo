package stepDefinition;

import org.openqa.selenium.WebDriver;

import RubixLoginPage.RubixLoginClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RubixStepDefinition extends RubixLoginClass {
	
	
	

//	public RubixStepDefinition(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

	@Given("the application is installed on the desired platform \\(Chrome)")
	public void the_application_is_installed_on_the_desired_platform_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		desiredPlatFormURL();
	}

	@When("the user launches the application")
	public void the_user_launches_the_application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lauchApplication();
	}

	@Then("the application should open successfully on the respective platform")
	public void the_application_should_open_successfully_on_the_respective_platform() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		applicationOpened();
	}
	
	@Given("the application is launched")
	public void the_application_is_launched() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		applicationIsLaunched();
	}

	@When("the user clicks on a module \\(Home, Services, Products, AI INTERNSHIP, Career, Blog)")
	public void the_user_clicks_on_a_module_home_services_products_ai_internship_career_blog() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		theUserClicksOnAModules();
	}

	@Then("the user should be navigated to the respective page displaying its content")
	public void the_user_should_be_navigated_to_the_respective_page_displaying_its_content() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		contentNames();
	}

	

}
