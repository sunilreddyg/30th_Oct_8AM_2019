package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_With_Partial_property {

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://mail.rediff.com/");      
		driver.manage().window().maximize(); 
		
		
		//click Singin page link
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		
		//Click Registration link
		driver.findElement(By.linkText("Create a new account")).click();
		
		
		//Identify Firstname Editbox
		driver.findElement(By.cssSelector("input[name*='name']")).clear();
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Arun");
		
		
		
		
		

	}

}
