package capture_Screen;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  //Launch browser
		driver.get("https://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();      //maximize browser window
						
		
		//Capture screen and converting into file format.
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dumping file into local utilities..
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
		
		
		/*
		 * Disadvantage of screen Capture at selenium-webdriver:-->
		 * 		1. Can't take screenshot when alert presented
		 * 		2. Only Capture Visible Interface [Top Interface]
		 * 		3. Image Override everytime, Incase File name not changed.
		 */
		

	}

}
