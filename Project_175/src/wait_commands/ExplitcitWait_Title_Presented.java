package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplitcitWait_Title_Presented 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://google.com");			  
		driver.manage().window().maximize();
		
		
		//Enable Explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		System.out.println("Timeout released Selenium Homepage title verified");
		
		
		//Click dowloads button
		WebElement Downloads=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		Downloads.click();
		
		
		
		//set explicit timeout to wait for partial title
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Downlaods page title verified");
		

	}

}
