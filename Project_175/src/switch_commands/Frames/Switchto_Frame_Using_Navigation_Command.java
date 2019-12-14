package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_Using_Navigation_Command 
{

	public static void main(String[] args) {
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");  
		driver.manage().window().maximize();      	 
			
		
		String FrameURL="https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true";
		driver.navigate().to(FrameURL);
		
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("1212121211");
		

		
		//Navigate back to mainapge
		driver.navigate().back();
	}

}
