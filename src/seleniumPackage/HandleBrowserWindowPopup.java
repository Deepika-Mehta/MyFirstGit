package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chirag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a")).click();
		Thread.sleep(5000);
		
		Set<String> handler = driver.getWindowHandles();//get the window id parent window and child window and will give set object & 2 id will be available in handler
		// get the value from set object we use iterator because it does not store the value on basis of index
	     
		Iterator<String> it = handler.iterator();// iterator will point just above the set object which contain he id of 2 window
	    // now will shift the pointer to the 1st value
	     String parentWindowId = it.next();
	     System.out.println("parent window id :it" +parentWindowId); // now 'it' will point to the 1st value
	     
	     String childWindowId = it.next();
	     System.out.println("child id is :" +childWindowId); // will to move to child window
	     
	     driver.switchTo().window(childWindowId); // control will switch to child window
	     Thread.sleep(5000);
	     
	     System.out.println("child window title is :" +driver.getTitle()); // get the title of child window
	     driver.close(); // close the child window or popup window
	     
	     // now we driver lost the control n we have to move to parent window
	     
	     driver.switchTo().window(parentWindowId);
	     System.out.println("title of parent window is" +driver.getTitle());
	     
	     Thread.sleep(5000);
	     it.next();// shift to next value(child)
	     
		
	}

}
