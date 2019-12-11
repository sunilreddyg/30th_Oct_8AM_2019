package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue {

	public static void main(String[] args) {
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						
		
		//Locate Element
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get style available at locatiion
		String BG_Color=Nifty_tab.getCssValue("background-color");
		String Font_Size=Nifty_tab.getCssValue("font-size");
		String Text_Alignment=Nifty_tab.getCssValue("text-align");
		
		
		System.out.println("background color in RGBA format => "+BG_Color);
		System.out.println("text size available  => "+Font_Size);
		System.out.println("text aligned at => "+Text_Alignment);
		
		
		if(BG_Color.equals("rgba(231, 120, 23, 1)"))
			System.out.println("Nifty tab selected");
		else
			System.out.println("Nifty tab not selected");
		
		
		

	}

}
