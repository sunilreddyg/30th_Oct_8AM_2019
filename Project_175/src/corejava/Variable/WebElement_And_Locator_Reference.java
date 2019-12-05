package corejava.Variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_And_Locator_Reference 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("http://facebook.com");			  
		driver.manage().window().maximize();	
		
		//Without Any reference
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9030248855");
		
		//With WebElement reference
		WebElement Login_pwd_EB=driver.findElement(By.xpath("//input[@id='pass']"));
		Login_pwd_EB.clear();
		Login_pwd_EB.sendKeys("Hello12345");
		
		//By Locator and WebElement references.
		By Login_btn_loc=By.xpath("//input[@value='Log In']");
		WebElement Login_btn=driver.findElement(Login_btn_loc);
		Login_btn.click();
		
		
		
		
		
	}

}
