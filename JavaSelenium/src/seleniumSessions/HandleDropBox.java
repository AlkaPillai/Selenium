package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		
		driver.get("https://www.facebook.com/");//Enter 
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select select = new Select(day);
		select.selectByVisibleText("10");
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("May");
		
		Select select2 = new Select(year);
		select2.selectByVisibleText("1989");
	
		
		
	}

	
}
