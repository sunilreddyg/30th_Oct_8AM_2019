package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Identification 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();   //Optional
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("Hello123456");
		
		driver.findElement(By.id("u_0_b")).click();

	}

}
