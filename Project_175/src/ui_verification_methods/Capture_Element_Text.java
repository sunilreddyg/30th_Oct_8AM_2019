package ui_verification_methods;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->  Gmail login with invalid domain-name
		 * 
		 * 		Given valid url http://gmail.com
		 * 		When user enter email with invalid domain address
		 * 		And click on Next button
		 * 		Then receive Expected Error msg 'Couldn't find your Google Account'. 
		 * 		
		 */
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("http://www.gmail.com"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
				
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@outlook.com"+Keys.RETURN);
		Thread.sleep(5000);
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String Runtime_err_text=Error_location.getText();
		
		String exp_err_text="Couldn't find your Google Account";
		
		if(Runtime_err_text.equals(exp_err_text))
			System.out.println("As expected error displayed on invalid domain address");
		else
			System.out.println("expected error msg not displayed on invalid domain address");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
