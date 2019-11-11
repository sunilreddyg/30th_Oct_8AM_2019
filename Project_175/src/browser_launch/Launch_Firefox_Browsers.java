package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browsers 
{

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver.exe:-->
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		select driver w.r.t browser version
		 * 				firefox browser version :-->  68
		 * 				geckodriver version     :-->  v0.26.0
		 * 		Download Zip format file w.r.t OS [WINDOWS]
		 * 		After download completed unzip file to backup folder
		 * 		
		 */
		
		//Store chromedriver path
		System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://google.com");
		
		

	}

}
