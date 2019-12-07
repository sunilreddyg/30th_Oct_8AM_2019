package ui_verification_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://selenium.dev/");			  
		driver.manage().window().maximize();
		
		//Currnt window page title
		String page_title=driver.getTitle();
		System.out.println("Current window title is => "+page_title);
		
		//Current window page url
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+page_url);
		
		//Current window pagesource.
		String page_source=driver.getPageSource();
		System.out.println(page_source);
		
		//Current window page dynamic ID
		String WindID=driver.getWindowHandle();
		System.out.println(WindID);
		
		//Get All window ID's
		Set<String> All_WindowIDS=driver.getWindowHandles();
		
		

	}

}
