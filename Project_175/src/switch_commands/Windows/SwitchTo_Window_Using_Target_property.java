package switch_commands.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_Using_Target_property {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://epass.apcfss.in/");  
		driver.manage().window().maximize(); 
		
		//Get current window Dynamic ID
		String Main_Window_DynamicID=driver.getWindowHandle();
		
		
		//Switch to Frame Using FrameID/Name property
		driver.switchTo().frame("messageFrame");
		
		
		//Identifying link under Messageframe
		WebElement College_Reports=driver.findElement(By.xpath("//a[@href='CollegeReports.html']"));
		College_Reports.click();
		
		
		//Get Controls to mainpage from frame
		driver.switchTo().defaultContent();
		//Apply switch to new frame
		driver.switchTo().frame("bodyFrame");
		
		
		Thread.sleep(5000); //Time to load a frame.
		//CLick link under body frame
		driver.findElement(By.xpath("//a[contains(.,'DistrictWise Colleges Report')]")).click();
		
		
		driver.switchTo().window("_new");
		Thread.sleep(3000);  //Timeout to load a window.
		System.out.println("Current Focused window title is => "+driver.getTitle());
		
		
		WebElement Ac_year=driver.findElement(By.xpath("//select[@name='ac_year']"));
		new Select(Ac_year).selectByIndex(2);
		
		
		//After Completed action at new window switch controls back to main window
		driver.switchTo().window(Main_Window_DynamicID);
		System.out.println("Current FoCused window title is => "+driver.getTitle());
			

	}

}
