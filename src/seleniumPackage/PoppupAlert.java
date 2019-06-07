package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PoppupAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click(); // click on go button
		
		
		Alert alert = driver.switchTo().alert();//  switch to popup 
		
		System.out.println(alert.getText()); //get text of popup 
		alert.accept(); // click on ok oryes
		//alert.dismiss(); // click on cancel
		String text = alert.getText();
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("correct");
		}else
			System.out.println("incorrect");
		
		
		
		
	}
	}