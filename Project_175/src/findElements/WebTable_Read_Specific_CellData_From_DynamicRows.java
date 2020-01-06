package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Specific_CellData_From_DynamicRows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");			  
		driver.manage().window().maximize();
		
		
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
		
		//Identify Webtable
		WebElement Table=driver.findElement(By.xpath("//div[@id='dvToplooser']/table"));
		
		//Find list of rows undet table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
				
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//Get dynamic rows using iteration incremenet
			WebElement SelectedRow=rows.get(i);
			
			//Find list of cells under selected row
			List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
			
			String Cname=cells.get(0).getText();
			String Hprice=cells.get(3).getText();
			
			System.out.println(Cname+"   "+Hprice);
		}

	}

}
