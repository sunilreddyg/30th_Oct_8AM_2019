package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Action_On_Element {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.naukri.com/");      
		driver.manage().window().maximize();
		
		
		WebElement Menu_jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		//Perform Mouse hover action at loation.
		new Actions(driver).moveToElement(Menu_jobs).perform();
		
		
		
				
				

	}

}
