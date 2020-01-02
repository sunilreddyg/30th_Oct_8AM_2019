package findElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Required_Date_From_Date_Picker 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.cleartrip.com/trains");			  
		driver.manage().window().maximize();
		
		String Exp_month="April 2020";
		String Exp_Day="10";
		
		WebElement Date_picker=driver.findElement(By.className("cal_openLink"));
		Date_picker.click();
		
		//Outter loop to Click Next month
		for (int i = 0; i <=3; i++) 
		{

			//IDentify Active month table
			WebElement Active_Month;
			Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
			
			//IDentify Active month table
			WebElement Active_Month_header;
			Active_Month_header=Active_Month.findElement(By.xpath("//th[@class='month']"));
			
			//Get monthname at runtime
			String Acutal_month=Active_Month_header.getText();
			if(Acutal_month.equals(Exp_month))
			{
				Active_Month.findElement(By.linkText(Exp_Day)).click();
				break; 
			}
			
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(2000);
		
			
		}
		

	}

}
