package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome

		
		driver.manage().window().maximize();//Maximize window
		driver.manage().deleteAllCookies();//Delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("Tester004");
		driver.findElement(By.name("password")).sendKeys("TestProfile@2019");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	
		//form[@id='vContactsForm']//tr[4]//td[2]
		//form[@id='vContactsForm']//tr[5]//td[2]
		//form[@id='vContactsForm']//tr[6]//td[2]
		//form[@id='vContactsForm']//tr[7]//td[2]
		
		//Method1 
 
/*		String before_xpath = "//form[@id='vContactsForm']//tr[";
		String after_xpath = "]//td[2]";
		for(int i =4; i<= 7;i++) {
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
		    System.out.println(name);
		    if(name.contains("Liam Bosco")) {
	
		    	driver.findElement(By.xpath("//body//form[@name='CONTACTSEARCH']//form//tr["+i+"]//td[2]")).click();
		    	
		    }		
		}*/
		
		//Method 2
		driver.findElement(By.xpath("//a[contains(text(),'Liam Bosco')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Adrian Thomas')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();

	}

}
