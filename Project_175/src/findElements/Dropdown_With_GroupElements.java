package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_With_GroupElements 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");			  
		driver.manage().window().maximize();
		
		
		String cities[]= 
						{
							"Please select state first",
							"South Andaman",		
							"Anantapur",
							"East Siang",
							"Darrang",
							"hdkfhd",
							"Chandigarh"
						};
		
		
		WebElement State_dropdown=driver.findElement(By.id("customState"));
		List<WebElement> All_States=State_dropdown.findElements(By.tagName("option"));
		
		//Iterate number of state available at dropdown
		for (int i = 0; i <= 6; i++) 
		{
			//get Each State using Index number
			WebElement EachState=All_States.get(i);
			EachState.click();
			Thread.sleep(5000);
			
			
			//Identify City location
			WebElement City_location=driver.findElement(By.id("customCity"));
			//get Option from City location
			String CityOptions=City_location.getText();
			
			if(CityOptions.contains(cities[i]))
			{
				System.out.println("for state "+EachState.getText()+"\t"+"\t"+" City displayed ==> "+cities[i]);
			}
			else
			{
				System.out.println("for state "+EachState.getText()+"\t"+"\t"+" City not displayed ");
			}
		}
		
		

	}

}
