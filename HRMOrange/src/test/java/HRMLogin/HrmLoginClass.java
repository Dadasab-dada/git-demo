package HRMLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import HRMUtility.HRM1;
import io.cucumber.java.After;

public class HrmLoginClass implements HRM1 {

	private static WebDriver driver;

//	public HrmLoginClass() {
//		if (driver == null) {
//			// System.setProperty("webdriver.chrome.driver", "path_to_chromedriver"); // Set
//			// the correct path
//			driver = new ChromeDriver();
//		}
//	}

	public void userlaunchBrowser() throws Exception {
		// driver = new ChromeDriver();
		if (driver == null) {
			driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(base_URL);
		Thread.sleep(20);
		}
	}

	public void enterValidCredentials(String username, String password) throws Exception {
		driver.findElement(enter_username).sendKeys("Admin");
		
		Thread.sleep(2000);

		driver.findElement(enter_password).sendKeys("admin123");
		
		Thread.sleep(2000);
	}

	public void clickLogin() throws Exception {
		driver.findElement(click_login).click();
		Thread.sleep(2000);
		// driver.close();
	}
	
	public void userclickonAdmin() throws Exception {
		List<WebElement> Allsuggest=driver.findElements(admi_click);
		for(int i=0; i< Allsuggest.size();i++) {
			String expResult="admin";
			if(Allsuggest.get(i).getText().equalsIgnoreCase(expResult)) {
				Allsuggest.get(i).click();
				break;
			}
		}
//		Thread.sleep(2000);
//		driver.findElement(admi_click).click();
		Thread.sleep(2000);
	}
	@After
	public void userreturnBackToDashBoard() throws Exception {
		Thread.sleep(2000);
		//driver.navigate().back();
		driver.findElement(dash_click).click();
	}
	

}
