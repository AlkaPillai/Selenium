package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//FF browser-Gecko driver is used to launch FF
		
		//System.setProperty("webdriver.gecko.driver","C://Users//dralk//Downloads//CHARLES/geckodriver-v0.24.0-win64//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//Google chrome browser
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.get("http://www.google.com");//Enter URL
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Valiadation point
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
			
			
		
		
		
		
		

	}
	

}
