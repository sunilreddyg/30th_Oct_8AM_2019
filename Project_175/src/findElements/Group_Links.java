package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://cleartrip.com");			  
		driver.manage().window().maximize();
		
		
		//identifying location of footerlinks
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));

		//Get list of links under footer area..
		List<WebElement> Footer_links;
		Footer_links=Footer_Area.findElements(By.tagName("a"));
	
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			//Get Each link using index number
			WebElement Eachlink=Footer_links.get(i);
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			System.out.println(linkname+"    "+linkhref);
			
			//Click each link
			Eachlink.click();
			Thread.sleep(3000);
			
			//navigate to homepage
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all links to avoid "StaleElementReference" Exception
			Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
			
		}
		
		
		
		
		
	}

}
