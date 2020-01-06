package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Target_SpecificCell_From_DynamicRow {

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
			
			
			//Get each row text
			String RowText=SelectedRow.getText();
			
			if(RowText.contains("TATSTE"))
			{
				//Find list of cells under selected row
				List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
				
				//Get New Cell under Selected row
				WebElement News_Cell=cells.get(7);
				
				//Click a link InsideNews Cell
				News_Cell.findElement(By.tagName("a")).click();
				break;  //Stop iteration once selected record found.
			}
			
			
		}


	}

}
