package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		
		//DynamicWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");//Enter 
		
		//1. Get the total amount of Link in the page
		//2. Get the text of each Link on the page
		
		//All the links are represented ny <a> html tag
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//Size of linkList
		System.out.println(linkList.size());
		
		for(int i = 0; i<linkList.size(); i++) {
			
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
