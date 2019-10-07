package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Next 4 lines are the answer for How to handle ALert popups(18-23)
		// The 21 st line helps to pause 
		
		driver.findElement(By.name("proceed")).click();//Click on go button
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.contentEquals("Please enter a valid user name")) {
		System.out.println("Correct alert msg");
	}
		else{
			System.out.println("Incorrect alert message");
		}
		
		alert.accept();//Click on ok button
		//alert.dismiss()://Click on cancel button
		
		
		
		
		
		
		
		
		
		

	}

}
