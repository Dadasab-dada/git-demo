package HRMLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.HRMConstants;

public class AdminClass {
  WebDriver adriver;

    public AdminClass(WebDriver driver) {
        this.adriver =driver;
        PageFactory.initElements(adriver, this);
    }

    public void clickAdminTab() {
        adriver.findElement(By.xpath(HRMConstants.ADMIN_TAB)).click();
    }

    public void clickAddButton() {
       adriver.findElement(By.xpath(HRMConstants.ADD_BUTTON)).click();
    }
}
