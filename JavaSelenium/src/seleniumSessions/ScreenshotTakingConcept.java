package seleniumSessions;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotTakingConcept {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


		driver.get("https://www.google.com/");
		takeScreenShot("Google_Homepage");
		
		
		
		
	}
	
	public static void takeScreenShot(String fileName) throws IOException {
		
		//1.Take screen shot and save it as a file format
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				//2.Now copy the screenshot to desired location using copyFile//Method
			                                                          
				FileHandler.copy(file,new File("C://Users//dralk//git//Selenium//JavaSelenium//src//seleniumSessions"+fileName+".jpg"));
				
				
				
				
	}

}
