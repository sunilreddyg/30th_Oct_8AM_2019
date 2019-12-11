package ui_verification_methods;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Editbox_input_value 
{

	public static void main(String[] args)
	{
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.spicejet.com/");			  
		driver.manage().window().maximize();
	
		
		//Target location of departure date editbox
		WebElement Departure_Date_Loc=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		//Get Actual date displayed at editbox
		String Act_Dep_Date=Departure_Date_Loc.getAttribute("value");
		System.out.println(Act_Dep_Date);
		
		
		//Get Default system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Convert default date format using simple date formatter
		String Exp_Dep_Date=sdf.format(d);
		
		
		//Verify using decison actual and expected dates
		if(Act_Dep_Date.equals(Exp_Dep_Date))
			System.out.println("As expected Departure date matching with current date");
		else
			System.out.println("Date mismatch with current date");

		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2019]
		 * 		  yy =>    year   [19]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
		
		
	}

}
