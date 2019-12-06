package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_presented {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://selenium.dev/");			  
		driver.manage().window().maximize();
		
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+page_url);
		
		if(page_url.contains("https://selenium.dev/"))
		{
			System.out.println("Homepage url verified");
			

			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("Download page url verified");
			else
				System.out.println("Download page url mismatch");
		}
		else
		{
			System.out.println("Homepage url not verfied");
		}

	}

}
