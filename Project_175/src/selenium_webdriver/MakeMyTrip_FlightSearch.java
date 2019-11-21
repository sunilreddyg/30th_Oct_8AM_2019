package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_FlightSearch {

	public static void main(String[] args) throws Exception {
	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);  //Static timeout until notification window displayed
		
		//Selecting roundtrip radio button
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		
		//Type Referral text into From Editbox
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
		Thread.sleep(3000);  //Timeout to load cities/Airports
		driver.findElement(By.xpath("(//p[contains(.,'Hyderabad, India')])[1]")).click();
		
		
		
		
	}

}
