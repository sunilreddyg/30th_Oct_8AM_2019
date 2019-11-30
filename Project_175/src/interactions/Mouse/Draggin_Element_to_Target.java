package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggin_Element_to_Target {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		WebElement Trash_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		
		//Performing drag and drop actions using indepedent Mouse Actions.
		new Actions(driver).clickAndHold(Doc1).moveToElement(Trash_Bin).release().perform();
		
		
		//Enable Mouse interaction at automation browser and store controls to referal keyword.
		Actions action=new Actions(driver);
		action.dragAndDrop(Doc2, Trash_Bin).perform();
		action.dragAndDrop(Doc3, Trash_Bin).perform();
		action.dragAndDrop(Doc4, Trash_Bin).perform();

	}

}
