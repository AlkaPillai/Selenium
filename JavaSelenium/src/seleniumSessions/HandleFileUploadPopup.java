package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//dralk//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome

		driver.get("http://html.com/input-type-file/");
		
		
		//type= "file" should be present for Browse/AttachFile/UploadFile Buttons
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\dralk\\Documents\\Exercise Files");
		
		
		
		

	}
	

	
}
