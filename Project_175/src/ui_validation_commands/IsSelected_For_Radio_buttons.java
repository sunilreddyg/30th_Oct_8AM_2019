package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_For_Radio_buttons {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  //Launch browser
		driver.get("https://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();      //maximize browser window
				
		
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		Roundtrip.click();
		
		//Decision accept only when roundtrip is selected
		if(Roundtrip.isSelected())
		{		
			WebElement Returndate=driver.findElement(By.xpath("//input[@id='ReturnDate']"));
			boolean flag=Returndate.isDisplayed();
			System.out.println("Return Date Display status is => "+flag);
		
		}
		else
			System.out.println("Precondition failed Roundtrip is not selected");
		
		


	}

}
