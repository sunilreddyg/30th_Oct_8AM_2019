package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Commands_Using_JS 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Enable Javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascript.[With ID property]
		js.executeScript("document.getElementById('email').value='9030248855'");
		js.executeScript("document.getElementById('pass').value='Newpwd44444'");

		//javascript execution using xpath or otherthan ID locations.
		WebElement Firstname_EB=driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].value='Suresh'", Firstname_EB);
		
		WebElement Surname_Eb=driver.findElement(By.xpath("//input[@name='lastname']"));
		js.executeScript("arguments[0].value='Kiran'", Surname_Eb);
		
	
		//Select dropdown using javascript [use dropdown option value ]
		js.executeScript("document.getElementById('day').value='22'");
		js.executeScript("document.getElementById('month').value='11'");
		js.executeScript("document.getElementById('year').selectedIndex ='12'");
				
		//Identify Female radio button using xpath
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked=true", Female_Rbtn);
		Thread.sleep(3000);
				
		//Identify male radio button using xpath
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
				
		
		
		
		
	}

}
