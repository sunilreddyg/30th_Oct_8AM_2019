package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veirifying_Element_Presented_At_pageSource {

	public static void main(String[] args) 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			
		
		
		try {
			
			WebElement Username=driver.findElement(By.id("identifierId"));
			Username.clear();
			Username.sendKeys("qadarshan@gmail.com");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run Finished");
		
		

	}

}
