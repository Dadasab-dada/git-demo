package Utility;

public interface HRMConstants {
    // URL for the OrangeHRM login page
    String LOGIN_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    // XPaths for login page elements
    String USERNAME_FIELD = "//input[@name='username']";
    String PASSWORD_FIELD = "//input[@type='password']";
    String LOGIN_BUTTON = "//button[@type='submit']";

    // XPaths for Admin functionality
    String ADMIN_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a";
    String ADD_BUTTON = "//button[normalize-space()='Add']";
}
