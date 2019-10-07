package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome

		
		driver.manage().window().maximize();//Maximize window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("Tester004");
		driver.findElement(By.name("password")).sendKeys("TestProfile@2019");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(3000);
		
		
		//Switch from frame to source-can accept integer or string
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		
		
		

	}
	

}
