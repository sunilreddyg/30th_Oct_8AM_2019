package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login 
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();      //launch browser
		driver.get("http://gmail.com");			  //Load webpage
		driver.manage().window().maximize();	  //maximize browser
		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		
		Thread.sleep(5000); //Static timeout to load password element
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("arjun12345"+Keys.ENTER);
		
		

	}

}
