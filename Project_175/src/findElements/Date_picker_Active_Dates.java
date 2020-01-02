package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_Active_Dates 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.cleartrip.com/trains");			  
		driver.manage().window().maximize();
		
		
		WebElement Date_picker=driver.findElement(By.className("cal_openLink"));
		Date_picker.click();
		
		
		//Outter loop to Click Next month
		for (int i = 0; i <=3; i++) 
		{
			
			
			//IDentify Active month table
			WebElement Active_Month;
			Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
			
			//Finding list of active dates under currnet month
			List<WebElement> Active_dates;
			Active_dates=Active_Month.findElements(By.tagName("a"));
			
			//Iteration for Active dates  [Innerloop]
			for (int j = 0; j < Active_dates.size(); j++) 
			{
				//Get Eachdate using index number
				WebElement Eachdate=Active_dates.get(j);
				Eachdate.click();
				Thread.sleep(1000);
				
				//Open Calendar to select another date
				Date_picker.click();
				
				//Restoring all links to avoid "StaleElementReference Exception"
				Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
				Active_dates=Active_Month.findElements(By.tagName("a"));
			}
			
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(2000);
		
			
		}
		
		
		
		
		

	}

}
