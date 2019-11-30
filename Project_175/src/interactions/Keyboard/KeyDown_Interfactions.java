package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_Interfactions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//navigate to Frame 
		driver.navigate().to("https://jqueryui.com/resources/demos/selectable/default.html");
		
		//To Hole contrl+Down option at webpage
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//To Release Control option at webpage
		new Actions(driver).keyUp(Keys.ARROW_DOWN).perform();
	}

}
