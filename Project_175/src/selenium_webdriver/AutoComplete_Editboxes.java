package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editboxes 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);  //Static timeout until notification window displayed
		
		
		//Select Roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Type referral keyword into from editbox.
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);  //Timeout required to load suggesstions.
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//type referral keyword into TO editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);  //Timeout required to load suggesstions.
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		//Select Active month date
		driver.findElement(By.linkText("26")).click();
		
		//Type text into Return Date editbox
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Thu, 23 Apr, 2020");
		
		//Select option from adults dropdown
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
		//Click Link using partialname
		driver.findElement(By.partialLinkText("More options:")).click();
		
		//Select Class of travel
		new Select(driver.findElement(By.id("Class"))).selectByIndex(2);
		
		//Type referral into autocomplete editbox
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara");
		Thread.sleep(5000); //Timeout required to load suggesstions.
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		//Click Button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
