package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies

		driver.get("https://www.spicejet.com");
		
		Actions action = new Actions(driver);
		/*action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		//Hard wait :so it will wait until the time mentioned
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SpiceMax")).click(); */
		
		action.moveToElement(driver.findElement(By.xpath("//span[@class='burger-bread']"))).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Flight Schedules')]")).click();
		
		
		
		
		
		

	}
	

}
