package seleniumPackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonlogin {
	WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Selenium project\\src\\seleniumPackage\\config.properties");
		 prop.load(ip);
		 String url = prop.getProperty("URL");
		 System.out.println(url);
		 String browsername = prop.getProperty("browser");
		 System.out.println(browsername);
		 
		 if(browsername.equals("chrome"))
				 {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 
			WebDriver driver = new ChromeDriver();
				 driver.get(url);
				 driver.manage().window().maximize();
				 Thread.sleep(5000);
				 //driver.close();
		driver.findElement(By.xpath(prop.getProperty("signIn_link_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
	   Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("sign_in_xpath"))).click();;
		Thread.sleep(8000);
		//driver.findElement(By.xpath(prop.getProperty("Search_xpath"))).sendKeys(prop.getProperty("searchss"));
		driver.findElement(By.id("pv-search-nav")).sendKeys("mirzapur");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("mirzapur episode 2")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'av-play-icon js-deeplinkable')]")).click();
		//driver.findElement(By.xpath("//*[@id="pv-nav"]/div/div/div[2]/div/ol/li[3]/a")).click();
		driver.findElement(By.cssSelector("#pv-nav > div > div > div.pv-nav-search > div > ol > li:nth-child(3) > a")).click();
		Actions action = new Actions(driver);
		//action.click(By.linkText("https://www.primevideo.com/search/ref=atv_sr_sug_8?phrase=mirzapur%20episode%202&ie=UTF8")).build().perform();
		action.contextClick(driver.findElement(By.cssSelector("#pv-nav > div > div > div.pv-nav-search > div > ol > li:nth-child(3) > a"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("play_btn_xpath"))).click();
		Thread.sleep(5000);
		//driver.close();
		}
		 
	}

}
