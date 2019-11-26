package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_And_InnerText 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.naukri.com/");      
		driver.manage().window().maximize(); 
		
		
		/*
		 * Identify Elemnet with element outtertext.
		 * HtmlSource:--> 
		 * 		<button  id="cjaMain">Create a Job Alert</button>
		 * Syntax:-->
		 * 			//tagname[text()='Elementtext']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
	
		/*
		 * IDentify Element with unique attribute proprty
		 * HtmlSource:-->
		 * 			<input placeholder="Skills, Designations, Roles, Companies" type="text">
		 * Sytnax:-->
		 * 		//tagname[@Attributename='Attributevalue']
		 */
		
		//Enter suggesstion keywords
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software testing");
		
		
		
		
		
		
		Thread.sleep(2000);  //Static timeout to load suggesstions.
		driver.findElement(By.xpath("//div[text()='Software Test Engineer']")).click();
		
		Thread.sleep(2000);  //Static timeout to load suggesstions.
		driver.findElement(By.xpath("//*[.='Functional Testing']")).click();
		
		Thread.sleep(2000);  //Static timeout to load suggesstions.
		driver.findElement(By.xpath("//div[text()='GUI Testing']")).click();
		
		

		

		/*
		 * IDentify Element with unique attribute proprty
		 * HtmlSource:-->
		 * 			<input name="keyskills" type="text" id="Sug_kwdsugg">
		 * Sytnax:-->
		 * 		//tagname[@Attributename='Attributevalue']
		 */
		

	}

}
