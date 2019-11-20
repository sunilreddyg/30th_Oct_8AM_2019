package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selecting_more_Than_one_Option {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);  //Static timeout
		
		/*		
		 * Using javascript changing Dropdown Selection from single option
		 * to multiple.
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);  //Static timeout
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		
		
		//write decision statemenet to accept execution on multiple selection type.
		if(flag==true)
		{
				//Write multiple selection commands to make multiple option selection dropdown
				Select StateDropdown=new Select(driver.findElement(By.id("customState")));
				StateDropdown.selectByIndex(3);
				StateDropdown.selectByIndex(5);
				StateDropdown.selectByIndex(7);
				
				//Get Multiple Option Selection count
				int Selection_count=StateDropdown.getAllSelectedOptions().size();
				if(Selection_count >1)
				{
					System.out.println("As expected dropdown accepted moret than one option");
				}
				else
				{
					throw new Exception("Failed to select morethan one option");
				}
			
			
		}
		else
		{
			throw new Exception("Dropdown is a not a multiple selection type");
		}
		
		
		System.out.println("Test Completed");


	}

}
