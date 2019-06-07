package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://operationsqa.nielsen.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'USER')]")).sendKeys("mehta.deepika.ap@nielsen.com");
		driver.findElement(By.xpath("//input[contains(@id,'PASSWORD')]")).sendKeys("Nielsen@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(10000);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span//div[contains(.,'Resource Management')]")).click();
		driver.getWindowHandle();
		Thread.sleep(10000);
		
	}

}