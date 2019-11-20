package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_Dropdown_Selection_Type 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Verifying Dropdown multiple selection type..
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       
		driver.manage().window().maximize(); 
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		Thread.sleep(5000); //Static timeout
		
		/*		
		 * Using javascript changing Dropdown Selection from single option
		 * to multiple.
		 */
	
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);  //Static timeout
		
		
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag1);
		
		
		
		
	}

}
