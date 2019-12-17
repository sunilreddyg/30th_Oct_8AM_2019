package switch_commands.Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_iterator {

	public static void main(String[] args) throws Exception
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://www.cleartrip.com/trains");  
		driver.manage().window().maximize(); 
		
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
		
		
		//Get All Dynamin Window ID's
		Set<String> AllWindow_IDS=driver.getWindowHandles();
		
		//Convert All collection of objects into iterators
		Iterator<String> itr=AllWindow_IDS.iterator();
		
		
		//Read First iterate object
		String Home=itr.next();
		driver.switchTo().window(Home);
		System.out.println("W1 title is => "+driver.getTitle());
		
		
		//Read Second Iterator object
		String Seat_Availability=itr.next();
		driver.switchTo().window(Seat_Availability);
		System.out.println("W2 title is => "+driver.getTitle());
		
		
		//Read third Iterator object
		String Pnt_status=itr.next();
		driver.switchTo().window(Pnt_status);
		System.out.println("W3 title is => "+driver.getTitle());
				
		
		
		
		
		
		

	}

}
