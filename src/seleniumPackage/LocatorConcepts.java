package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//1.xpath(avoid absolute xpath and used relative xpath)
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deepika");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("mehta");
		
		//2.id
		//driver.findElement(By.id("email")).sendKeys("deepika");
		
		//3.name
		driver.findElement(By.name("email")).sendKeys("deepika");
		
		//4.linktext
		//driver.findElement(By.linkText("Data Policy")).click();
		
		//5.partiallinktext(should not used)used when the long string of text is there for link
		//driver.findElement(By.partialLinkText("Why do")).click();
		
		//6.css selector(if id is there :put # before id value)
		//if class ia there then put . before class name
		//driver.findElement(By.cssSelector("#pass")).sendKeys("sadsa");
		
		//7.class name: not useful can be dupliate
		//driver.findElement(By.className("inputtext")).click();

	}

}
