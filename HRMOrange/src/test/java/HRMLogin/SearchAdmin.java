package HRMLogin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import HRMUtility.HRM1;

public class SearchAdmin implements HRM1 {
	  WebDriver driver;

	    public SearchAdmin(WebDriver driver) {
	        // No-argument constructor for Cucumber
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }

//	    public void setDriver(WebDriver driver) {
//	        this.driver = driver;
//	    }
	
//	 WebDriver driver;
//	
//	public SearchAdmin(WebDriver driver) {
//        this.driver = driver;
//    }
	
	public void clickAdminElement() throws Exception {
		Thread.sleep(2000);
		driver.findElement(admin_click).click();
//		 if (driver == null) {
//	            throw new RuntimeException("WebDriver is not set in SearchAdmin class!");
//	        }
//	        driver.findElement(admin_click).click(); // Replace with the correct locator
//	    }
//		
		//driver.findElement(admin_click).click();
//		List<WebElement> Allsuggest=driver.findElements(admin_click);
//		for(int i=0; i< Allsuggest.size();i++) {
//			String expResult="admin";
//			if(Allsuggest.get(i).getText().equalsIgnoreCase(expResult)) {
//				Allsuggest.get(i).click();
//				break;
//			}
//		}
	}
	
	public void systemUsername() throws Exception {
		Thread.sleep(2000);
		driver.findElement(system_User).sendKeys("Admin");
//		if(driver == null) {
//
//		driver.findElement(system_User).sendKeys("Admin");
//		}
	}

	public void userRoleDropdClick() throws Exception {
		Thread.sleep(2000);
		driver.findElement(click_Dropd).click();
//		if(driver == null) {
//
//		driver.findElement(click_Dropd).click();
//		}
	}
	
	public void selectRoleFromDropd() throws Exception {
		Thread.sleep(2000);
		driver.findElement(select_role).sendKeys("Admin");
//		if(driver == null) {
//
//		driver.findElement(select_role).sendKeys("Admin");
//		}
	}
	
	public void employeNameEnter() throws Exception {
		Thread.sleep(2000);
		driver.findElement(employe_name).sendKeys("abababa user");
//		if(driver == null) {
//
//		driver.findElement(employe_name).sendKeys("abababa user");
//		}
	}
	
	public void clickStatus() throws Exception {
		Thread.sleep(2000);
		driver.findElement(click_status).click();
//		if(driver == null) {
//
//		driver.findElement(click_status).click();
//		}
	}
	public void selectStatus() throws Exception {
		Thread.sleep(2000);
		driver.findElement(select_status).sendKeys("Enabled");
//		if(driver == null) {
//
//		driver.findElement(select_status).sendKeys("Enabled");
//		}
	}
	public void searchButton() throws Exception {
		Thread.sleep(2000);
		driver.findElement(search_on);
//		if(driver == null) {
//
//		driver.findElement(search_on);
//		}
	}
}
