package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome

		
		driver.manage().window().maximize();//Maximize window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java Tutorials ");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbab']"));
		System.out.println("Total no:of sugggetions in search Box::"+ list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Java tutorial for beginners")) {
				list.get(i).click();
				break;
			}
		}
		
		
		
		
		

	}

}
