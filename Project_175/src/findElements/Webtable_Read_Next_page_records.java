package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Read_Next_page_records {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
		
		//click Nifty Weightage link
		driver.findElement(By.linkText("Nifty Weightage")).click();
		Thread.sleep(5000);
		
		//Target Webtable
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//using table find list of rows available
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		
		int count=0;
		for (int i = 0; i < rows.size(); i++) 
		{
			
			String Rtext=rows.get(i).getText();
			System.out.println(Rtext);
			
			if(count==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("//th[@colspan='1'][contains(.,'Next > >')]"));
				Next_btn.click();
				Thread.sleep(5000);
				count=0;
			}
			
			count=count+1;
	
		}
		
		
		
		
		
		
		
		
		
		
	}

}
