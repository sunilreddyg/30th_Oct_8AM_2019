package ui_verification_methods;

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
		
		String page_title=driver.getTitle();
		System.out.println("Current window title is => "+page_title);
		
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+page_url);
		
		String page_source=driver.getPageSource();
		System.out.println(page_source);
		
		
		
		

	}

}
