package selenium.webdriber.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumtestcase {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//CHARLES//geckodriver-v0.24.0-win64//chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		
		
		WebDriver driver = new ChromeDriver();
				
		
		driver.get("http://newtours.demout.com");
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
		
	
		
		
		
		
	}

}
