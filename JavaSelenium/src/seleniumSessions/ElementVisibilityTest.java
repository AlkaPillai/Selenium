package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		
		//DynamicWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/register/");//Enter URL
		
		//1.IsDisplayed() method is applicable for all the elements
		
		boolean b1 = driver.findElement(By.className("myButton")).isDisplayed();//for Submit Button
		System.out.println(b1);//True
		
		//2.IsEnabled() method:
		
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//False
		
		//Select I agree check box:
		driver.findElement(By.name("agreeTerms")).click();//Submit button is enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);//True
		
		//3. IS selected() method :only applicable to radiobuttons,dropdowns and check boxes.
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);//True
		
		//4. Deselecting the checkbox:
		driver.findElement(By.name("agreeTerms")).click();//Submit button is enabled now
		boolean b5 = driver.findElement(By.id("submitButton")).isSelected();
		System.out.println(b5);//False
		
		
		
		
		
		

	}

}
