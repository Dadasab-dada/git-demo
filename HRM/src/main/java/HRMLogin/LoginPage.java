package HRMLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.HRMConstants;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterValidUsernameAndPassword(String username, String password) {
       driver.findElement(By.xpath(HRMConstants.USERNAME_FIELD)).sendKeys(username);
       driver.findElement(By.xpath(HRMConstants.PASSWORD_FIELD)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath(HRMConstants.LOGIN_BUTTON)).click();
    }
}
