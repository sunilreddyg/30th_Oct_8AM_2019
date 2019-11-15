package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_shortcuts 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
				
		WebDriver driver=new ChromeDriver();      //launch browser
		driver.get("http://facebook.com");			  //Load webpage
		driver.manage().window().maximize();	  //maximize browser
				
		
		//Keyboard shortcuts at editbox
		driver.findElement(By.id("u_0_m"))
		.sendKeys("Kranthi"+Keys.TAB
				+"Kumar"+Keys.TAB
				+"KranthiKumar@gmail.com"+Keys.TAB
				+"KranthiKumar@gmail.com"+Keys.TAB
				+"Newpwd1234");
		
		//keyboard shortcuts at dropdown using sequence of chracters
		driver.findElement(By.id("day")).sendKeys("25");
		
		//Month dropdown using Arrowdown shortcut
		driver.findElement(By.id("month")).sendKeys("1234");
		
		//Select Year Dropdown using  Sequence of characters as shortcut
		driver.findElement(By.id("year")).sendKeys("1990");
		
		
		
		/*
		 * Note:-->
		 * 			Becuase Sendkeys command accept Keyboard shortcuts,
		 * 			For keyboard shrotcuts webdriver doesn't throw any
		 * 			exception on invalid inputs.
		 * 		
		 */
		
		
	}

}
