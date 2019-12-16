package switch_commands.Windows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Required_Window_From_Multiple_Windows {

	public static void main(String[] args) throws Exception {
		
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
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		

		//Get All windows Dynamic ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		//Apply foreach to iterate collection of objects
		for (String EachwindowID : Allwindow_IDS) 
		{
			//Switch to every window in collection
			driver.switchTo().window(EachwindowID);
			
			//Get Each window Runtime title
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			
			if(Runtime_title.contains("Rail Tour Packages"))
			{
				break; //Break iteration when expected window title match
			}
		}
		
		
		System.out.println("Focused window title is => "+driver.getTitle());
		
		

	}

}
