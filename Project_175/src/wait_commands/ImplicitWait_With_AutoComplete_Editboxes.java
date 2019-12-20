package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait_With_AutoComplete_Editboxes 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);  //Static timeout until notification window displayed
		
		
		//Select Roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Type referral keyword into from editbox.
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("JAI");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//type referral keyword into TO editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		driver.manage().timeouts()
		.implicitlyWait(30, TimeUnit.SECONDS)
		.pageLoadTimeout(30, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
	
	}	

}
