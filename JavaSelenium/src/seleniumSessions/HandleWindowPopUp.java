package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		
	
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent WIndow id:"+ parentWindowId );
		
		
		String childWindowId = it.next();
		
		Thread.sleep(2000);
		System.out.println("Child Window Id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		System.out.println("Child window pop up Title:" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent window pop up Title:" + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
