package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadPropertyFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:/Users/dralk/git/Selenium/JavaSelenium/src/seleniumSessions/config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println((prop.getProperty("age")));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName =  prop.getProperty("browser");
		
		
		if (browserName.equals("chrome")) {
		
		

		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		 driver = new ChromeDriver();//Launch Chrome
		
		}
		
		else if (browserName.contentEquals("FF")) {
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\dralk\\Downloads\\CHARLES\\geckodriver-v0.24.0-win64");
			 driver = new FirefoxDriver();//Launch Chrome
			

			
		}
		
	
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id(prop.getProperty("email_id "))).sendKeys(prop.getProperty("email"));



	}

}
