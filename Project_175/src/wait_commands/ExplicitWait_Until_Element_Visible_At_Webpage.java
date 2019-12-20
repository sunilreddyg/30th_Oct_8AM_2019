package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Until_Element_Visible_At_Webpage {

	public static void main(String[] args) {
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();     
		driver.get("http://gmail.com");			  
		driver.manage().window().maximize();	  
		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan");
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		System.out.println("Timeout released password visible at webpage");
		
		//Type text into editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("arjun12345"+Keys.ENTER);
		
				

	}

}
