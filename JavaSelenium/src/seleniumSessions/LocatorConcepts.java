package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		
		
		//1.xpath----2
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&pageType=3984&ru=https%3A%2F%2Fmy.ebay.com%2Fws%2FeBayISAPI.dll%3FMyEbayBeta%26MyEbay%3D%26gbh%3D1%26guest%3D1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26pageType%3D3984%26ru%3Dhttps%253A%252F%252Fmy.ebay.com%252Fws%252FeBayISAPI.dll%253FMyEbayBeta%2526MyEbay%253D%2526gbh%253D1%2526guest%253D1");//Enter 
		
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Kim");
		//driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Rabbit@19");
		
 
		//2.id------1
		
		//driver.findElement(By.id("Firstname")).sendKeys("Tom");
		//driver.findElement(By.id("Lastname")).sendKeys("Peter");
		
		//3.Name----3
		//driver.findElement(By.className("FirstName")).sendKeys("tom");
		
		//4.By Link text:This is only for links
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.PartialLinkText(NotUseful)
		//driver.findElement(By.partialLinkText)("How to pick")).sendKeys.click();
		
		//6. CSS Selector---2
		//Ist way- if id is there--#[id]
		//2nd way --if class is there ---.{class}
		//driver.findElement(By.cssSelector("Email")).sendKeys("alkapillai@");
		
		//7. Class name:not useful-4
		driver.findElement(By.className("sgnInTxt")).click();
		
		
	}
	

}
