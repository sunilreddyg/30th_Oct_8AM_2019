package pageobjects.Pagefactory.With_Global_Constructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Search_Flights {

	public static void main(String[] args) {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		Search_Flights flights=new Search_Flights(driver);
		flights.flight_search_oneway_trip();
	}

}
