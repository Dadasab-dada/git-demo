package Yard;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Logger logger=Logger.getLogger("Practice3");
		
		
		PropertyConfigurator.configure("D:\\ProgramsTesting\\newYork\\Repository\\log4j.properties");
		
		WebDriver driver=new ChromeDriver();
		logger.info("Chrome browser instance opened");
		
		driver.manage().window().maximize();
		logger.info("Window maximized");
		
		driver.get("htps://www.facebook.com/");
		//logger.info("application is openend");
		logger.info("application is openend");
		
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element displyed");
		} catch (Exception e) {
			logger.info("failure web elemnt not displyed");
		}
		
		
	}

}
