package findElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_Dropdown_Option_At_Webpage {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("http://cleartrip.com");			  
		driver.manage().window().maximize();
		
		
		
		List<WebElement> list=driver.findElements(By.tagName("select"));
		for (int i = 0; i < list.size(); i++) 
		{
			//Get Each object using get method
			WebElement Each_Dropdown=list.get(i);
			new Select(Each_Dropdown).selectByIndex(1);
			
		}
		

	}

}
