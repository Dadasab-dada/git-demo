package TestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	@Test
	public void testCase1() {

		String expectedText = "Facebook helps you connect and share with the people in your life.";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com/");

		String actualText = driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).getText();

		// equal assertion
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Equal assertion pass");

		// false assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isSelected());
		System.out.println("False assertion verified");

		// false assertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isDisplayed());
		System.out.println("True assertion verified");

	}
}