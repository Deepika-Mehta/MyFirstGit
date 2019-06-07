package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//for headless browser we have chromeoptions class
		//chrome version should be greater than 60 for windows
		ChromeOptions options = new ChromeOptions();
		//now you have to use window size because the default window size for this is mobile windw size
		options.addArguments("window-size=1400,800");// mandaory code
		options.addArguments("Headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		System.out.println("Login page title--" +driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("deepikamehta1213@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123#aA");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("Home page title--" +driver.getTitle());
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		
		
		

	}

}
