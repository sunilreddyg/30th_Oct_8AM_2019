package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute1 {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");			  
		driver.manage().window().maximize();
	
		
		//Identify location of nifty tab
		WebElement NiftyTab=driver.findElement(By.xpath("//a[contains(.,'NIFTY')]"));
		

		//Get Runtime Attribute value
		String Runtime_Attribute=NiftyTab.getAttribute("class");
		String Exp_Attribute="tab-active";
		
		if(Runtime_Attribute.contains("tab-active"))
		{
			System.out.println("As expected nifty tab selected on site launch");
		}
		else
		{
			System.out.println("on site launch nifty tab was not selected");
		}
	}

}
