package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Do_While 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Example:--> Print number 1 to 10
		int i=1;
		do {
		
			System.out.println(i);
			i=i+1;
			
		} while (i<=10);
		
		
		
		
		
		//Example:--> When Given conditon return false
		int j=100;
		do {
			System.out.println("First job finished => "+j);
			j=j+1;
		} while (i<10);
		
		
		
		//Example:--> Wait Until Expected page load at webpage.

		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
			
		boolean flag=false;
		int k=0;
		do {
			driver.get("http://facebook.com");
			Thread.sleep(5000);
		
			flag=ExpectedConditions.titleIs("Facebook – log in or sign up").apply(driver);
			
			k=k+1;
			if(k==10)
			{
				throw new Exception("pageload fail after waiting "+k+"  Seconds");
			}
			
		} while (!flag==true);  //It eject loop when element found
	
				
		
		System.out.println("page found");
		
		
		

	}

}
