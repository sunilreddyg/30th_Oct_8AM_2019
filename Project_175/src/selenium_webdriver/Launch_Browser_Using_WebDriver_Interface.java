package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Using_WebDriver_Interface 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Launching chrome browser and store referal into webdriver interface
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window.
		driver.get("http://gmail.com");
		
		/*
		 * Exceptions:-->
		 * 			=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 				 IllegalStateException:-->
		 * 							When Chromdriver.exe file not located
		 * 							under current system.
		 * 
		 * 			=> driver.get("http://google.com");
		 * 		
		 * 				SessionNotCreated:-->
		 * 							Exception display when browserdriver
		 * 							version mismatch with browser version.
		 */
		
		
		
	}

}
