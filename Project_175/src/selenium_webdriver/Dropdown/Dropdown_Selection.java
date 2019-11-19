package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		
		Thread.sleep(3000);  //Static timeout to load cities
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Dilsukhnagar");

		//Select dropdown option using index number
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		//Select checkbox [We use click command to select & deselect checkbox]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//Click search button using xpath locator
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
	}

}
