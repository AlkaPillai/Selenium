package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();//Launch Chrome
		
		//htmlunitdriver is not available in Selenium 3.x version
		//htmlunitdriver -- to use this concept, we have to download htmlunitdriver JAR file
		
		// Advantages of Html unitDriver
		// 1. testing is happening behind the scene no browser is launched
		// 2. Very fast -- execution of test cases -- very fast performances of the script.
		// 3. not suitable for Actions class -- user actions-- mouse movements, double click, drag and drop
		//4. Ghost driver -- Headless Driver:
		      // HtmlUnit Driver ---Java
		      // PhantomJS -- Javascript
		          
		
		     // Html unitDriver -- Java
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();//How to maximize the window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		
		//DynamicWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html");
		
		System.out.println("Before login, the title is---"+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("tester004");
		
		driver.findElement(By.name("password")).sendKeys("TestProfile@2019");
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		Thread.sleep(2000);
		System.out.println("after login, title is:----" + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
