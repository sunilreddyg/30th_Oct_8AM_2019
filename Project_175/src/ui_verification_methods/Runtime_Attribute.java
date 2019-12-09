package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class Runtime_Attribute {

	public static void main(String[] args) throws Exception
	{

			/*
			 * TestScenario:--> Verify roundtrip selection
			 * 
			 * 			Given url is http://makemytrip.com
			 * 			when user tap on return date 
			 * 			Then trip type selection comes to roundtrip.
			 */
		
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.makemytrip.com/flights/");			  
		driver.manage().window().maximize();
		
		
		//IDentify return date Locaiton
		WebElement ReturnDate_Loc=driver.findElement(By.xpath("//p[contains(@data-cy,'returnDefaultText')]"));
		ReturnDate_Loc.click();
		Thread.sleep(5000);
		
		
		//Identfy Roundtrip location
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		//Capture Roundtrip runtime attribute value
		String Runtime_Attribute=Roundtrip.getAttribute("class");
		
		String Exp_Attribute="selected";
		
		if(Runtime_Attribute.equals(Exp_Attribute))
		{
			System.out.println("As expected roundtrip selected on return date selection");
		}
		else
		{
			System.out.println("Roundtrip selection failed on return date selection.");
		}
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
 

	}

}
