package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.google.com/");
	}

	@When("User enters a text in a search box")
	public void user_enters_a_text_in_a_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[contains(@role,'com')]")).sendKeys("Cucumber Test");
	}

	@When("Hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[contains(@role,'com')]")).sendKeys(Keys.ENTER);
	}

	

	@Then("User is navigated to search")
	public void user_is_navigated_to_search() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.getPageSource().contains("Test Automation Software");
	}


}
