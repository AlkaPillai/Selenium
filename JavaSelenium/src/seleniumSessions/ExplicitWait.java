package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		
		//DynamicWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");//Enter
		
		//clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")), 20);//login button
		//clickOn(driver, driver.findElement(By.xpath("//a[@class='_8esh']")), 10); //create a page link

		clickOn(driver, driver.findElement(By.xpath("//a[contains(text(),'Locations')]")),10);
		
		
		
		

	}
	
	
	
	
	
	


	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));

		locator.click();

	}

}
