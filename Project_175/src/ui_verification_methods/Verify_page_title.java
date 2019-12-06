package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://selenium.dev/");			  
		driver.manage().window().maximize();
		
		String Actual_title=driver.getTitle();
		System.out.println("Current window title is => "+Actual_title);
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		boolean flag=Actual_title.equals(Exp_title);
		System.out.println("Page title verification status is => "+flag);

		//Decison to print Testpass/fail based on return page title.
		if(flag==true)
		{
			System.out.println("expected title presented for Selenium Homepage");
			
			WebElement Download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			Download_link.click();
			
			
		}
		else
		{
			throw new Exception("Wrong page displayed for seleniumhq homepage");
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
