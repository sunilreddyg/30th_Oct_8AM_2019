package switch_commands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class AlertHandling_With_Try_Catch {

	public static void main(String[] args) {
		
		/*
		 * Scenario:-->
		 * 		Given site url https://www.firstnaukri.com/
		 * 		When user click search button witout enter Course and keywords
		 * 		Then system should display Alert window with approriate error message.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();      	 //maximize browser window
			
		//Invalid Action clicking witout mandatory fields selection
		WebElement Search_button=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_button.click();
		
		
		try {
			
			Alert alert=driver.switchTo().alert();
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			//Close alert window
			alert.accept();
			
			
		} catch (NoAlertPresentException e) {
			System.out.println("alert not presented");

		}
		
		
		System.out.println("Run Continued");
		
		
		
		
	}

}
