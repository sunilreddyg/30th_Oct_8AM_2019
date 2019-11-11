package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 	 URL :--> https://chromedriver.chromium.org/downloads
		 * 		 => Select chromedriver version w.r.t chrome browser.
		 * 					chrome 78 => chromedriver 78
		 * 		 => Select chromedriver zip format file for windows
		 * 		=> After download complete unzip file to backup folder.
		 * 		=> And then create runtime environment variable before launch 
		 * 				chrome browser.
		 * 
		 * 			System.Setproperty("webdriver.chrome.driver",
		 * 						"location of chromedriver.exe");
		 */
	
		//Creating runtime environment varaible
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//Load new webpage to browser
		chrome.get("http://gmail.com");
		
		
		chrome.findElementById("identifierId").sendKeys("qadarshan");
		
		
	}

}
