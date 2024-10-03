package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser window is open")
	public void browser_window_is_open() {
		System.out.println("inside : browser window is open");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside : user is on google search page");
		driver.navigate().to("https://google.com");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("inside : user enters a text in search box");
		driver.findElement(By.id("input")).sendKeys("Automation Step by Step");

		Thread.sleep(2000);

	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("inside : hits enter");
		driver.findElement(By.id("input")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("inside :");
		

		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();

	}

}
