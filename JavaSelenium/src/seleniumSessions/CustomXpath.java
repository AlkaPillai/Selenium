package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		
		//DynamicWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.ebay.com/");//Enter 
		
		//Absolute path :not  recommended
		//html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/input[1]
		//Disadvantages:
		//1. Performance issue
		//2. Not reliable
		//3. Can be changed at any time in future.
		
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");	
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("Java");
		
		//Dynamic id :input : 
		//use contains@id,'test' 
		//id=test_123
		
		// Use starts-with@id,'test'
		//By.id=("test_456")
		//id = test_2345
		//id = test_7890
		//id = test_test_3456_test
		
		// Use ends-with
		//id = 1234_test_t
		//id = 7654_test_t
		//id = 98765_test_t
		
		/*  driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Search");
		driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]")).sendKeys("File");      */
		
		
		//for Links: Custom xpath
		// all the links are represented by <a> html tag:
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Your Amazon.com')]")).click();
		
		
		
		
		
		

	}

}
