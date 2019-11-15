package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_link 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();      //launch browser
		driver.get("http://facebook.com");			  //Load webpage
		driver.manage().window().maximize();	  //maximize browser
				
		//Click forgotten account link
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//Enter recovery email
		driver.findElement(By.id("identify_email")).clear();
		driver.findElement(By.id("identify_email")).sendKeys("qadarshan@gmail.com");
		
		//click Next button
		driver.findElement(By.name("did_submit")).click();
		
		Thread.sleep(5000);
		//Click Continue button
		driver.findElement(By.name("reset_action")).click();
		
		Thread.sleep(5000);
		//Click link
		driver.findElement(By.linkText("Didn't get a code?")).click();
		
		
	}

}
