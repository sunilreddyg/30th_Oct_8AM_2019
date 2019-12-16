package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://facebook.com/");  
		driver.manage().window().maximize(); 
		
		
		//get Current window Dynamic ID
		String MainWindow_ID=driver.getWindowHandle();
		
		
		//Click external link [It open's page at  a new window.]
		WebElement Instagram_link=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		Instagram_link.click();
		
		
		//Get All windows Dynamic ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		//Apply foreach to iterate collection of objects
		for (String EachwindowID : Allwindow_IDS) 
		{
			if(!EachwindowID.equals(MainWindow_ID))
			{
				driver.switchTo().window(EachwindowID);
				break; //Stop iteration on condition match.
			}
		}
		
		Thread.sleep(5000); //Timeout to load a window.
		System.out.println("Current Focused window title is => "+driver.getTitle());
		
		
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		
		
		//After completed action at instagram switch controls back to mainwindow
		driver.switchTo().window(MainWindow_ID);
		
		
		//Identify location at Mainwindow
		WebElement Email_Eb=driver.findElement(By.id("email"));
		Email_Eb.clear();
		Email_Eb.sendKeys("9030248855");
		
		
	}

}
