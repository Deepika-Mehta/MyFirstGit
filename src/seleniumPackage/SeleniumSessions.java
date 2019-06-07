package seleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSessions {

	public static void main(String[] args) {
		//1. firefox driver
		// geckodiver
		
		//System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");		
		//WebDriver driver = new FirefoxDriver();  //launch FF browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Google"))
        {
        	
        	System.out.println("Correct");
        	
        }
        else
        	System.out.println("Incorrect");
        System.out.println(driver.getCurrentUrl());
        
        driver.quit();        
	}

}
