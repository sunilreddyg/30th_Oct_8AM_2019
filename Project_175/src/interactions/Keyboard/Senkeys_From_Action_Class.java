package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senkeys_From_Action_Class 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Click Course editbox to display list of options
		driver.findElement(By.xpath("//input[@name='course']")).click();
		
		
		
		//Enable Keybaord interaction on automation browser
		Actions action=new Actions(driver);
		
		//Keyboard shortcut on webpage.
		action.sendKeys("MCA").pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
		
		
		//Type Text into Location editbox and select Option from referral list, After
		//providing time gap.
		
		WebElement Location=driver.findElement(By.xpath("//input[contains(@name,'ql')]"));
		action.sendKeys(Location, "HYD").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		

	}

}
