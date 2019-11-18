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

	}

}
