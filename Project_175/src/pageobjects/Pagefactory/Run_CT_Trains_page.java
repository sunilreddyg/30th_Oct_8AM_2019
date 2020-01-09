package pageobjects.Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class Run_CT_Trains_page {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		/*
		 * 	Note:--> Inorder to identify @findby annotation we muset access through
		 * 			 page factory class..
		 */
		
		CT_Trains trainspage=PageFactory.initElements(driver, CT_Trains.class);			
		trainspage.SearchTrain();     //Method from trains page
		trainspage.Search_train_BTN.click();

	}

}
