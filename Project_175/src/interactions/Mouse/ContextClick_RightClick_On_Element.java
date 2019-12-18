package interactions.Mouse;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick_On_Element {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		//Idenify location at webapge
		WebElement Element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Perform Context click action on element [Right-click]
		new Actions(driver).contextClick(Element).perform();
		
		//Identifying Delete button under Contextmenu
		WebElement Delete_option=driver.findElement(By.xpath("//span[text()='Delete']"));
		
		//performing click action from MouseInterfactions.
		new Actions(driver).click(Delete_option).perform();
		
		//close Alert 
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	
	}

}
