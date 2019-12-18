package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Function_Using_Javascript_Executor {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 			    //Launch browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");    //Load webpage
		driver.manage().window().maximize();      	 				//maximize browser window
			
		
		WebElement Element=driver.findElement(By.xpath("//a[contains(.,'Create a new account')]"));
		Element.click();

	}

}
