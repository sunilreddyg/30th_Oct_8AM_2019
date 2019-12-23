package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifying_Elemnet_Visibility_And_Hidden_With_ExplicitWait {

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.cleartrip.com/");			  
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		Roundtrip.click();
		
		//Explicit time until expected radio button selection is true
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.elementSelectionStateToBe(Roundtrip, true));
		System.out.println("Timeout released roundtrip is selected");
		
		
		
		WebElement Return_Date_Loc=driver.findElement
				(By.xpath("//input[@title='Return date']"));
		
		//expclicit timeout until expected element is visible at webpage
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.visibilityOf(Return_Date_Loc));
		System.out.println("Test verified Return date visible on roundtrip selection");
		
		
		
		//Select Oneway Radio button
		WebElement oneway_loc=driver.findElement(By.xpath("//input[@id='OneWay']"));
		oneway_loc.click();
		
		
		
		//Explicit timeout until expected element to be hide.
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.invisibilityOf(Return_Date_Loc));
		System.out.println("Return is hidden on oneway selection");
		
		
		
		
	}

}
