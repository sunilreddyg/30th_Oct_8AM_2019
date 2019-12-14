package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_FrameID {

	public static void main(String[] args) {
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");  
		driver.manage().window().maximize();      	 
			
		
		//Swith to frame using frame ID/name property
		driver.switchTo().frame("modal_window");
		
		//Identifying Email location under frame...
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		//Identifying tripID elemnet under frame
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("1212121211");
		
		
		//Get control back to Mainpage
		driver.switchTo().defaultContent();
		
		
		//identifying locations at mainpage
		WebElement Image_Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Image_Flights.click();
		
		
	}

}
