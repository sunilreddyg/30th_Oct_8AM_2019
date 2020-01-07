package method_parameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	public WebDriver driver;
	public String driver_path="drivers\\";
	public WebDriverWait wait;
	/*
	 * Keyword:--> Launch browser [Chrome, Firefox, IE]
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void launch_browser(String browsername)
	{
		
		switch (browsername) 
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
				driver=new ChromeDriver();
				break;
			
			case "firefox":
				System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
				driver=new FirefoxDriver();
				break;
			
			case "ie":
				System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				break;

			default: 
					System.out.println("Browser name mismatch");
				break;
		}
		
	}
	
	
	
	/*
	 * Keyword:--> Application load with http:// and https:// protocal
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void load_app(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword:--> manage implicit and explicit wait
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void set_timeout(int time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * Keyword:--> Text entry at editbox using xpath locator
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void Enter_text(String Element_xpath,String inputdata)
	{
		driver.findElement(By.xpath(Element_xpath)).clear();
		driver.findElement(By.xpath(Element_xpath)).sendKeys(inputdata);
	}
	
	
	/*
	 * Keyword:--> Text entry at editbox using By locator reference
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void Enter_text(By locator,String inputdata)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	

	/*
	 * Keyword:--> Text entry at editbox using WebElement Interface reference
	 * 					[this keyword userfull for POM Framework]
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void Enter_text(WebElement element,String inputdata)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(element));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	
	
	
	/*
	 * Keyword:--> select dropdown using xpath locator
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void select_dropdown(String Element_xpath,String Option_name)
	{
		WebElement Dropdown=driver.findElement(By.xpath(Element_xpath));
		new Select(Dropdown).selectByVisibleText(Option_name);
	}
	
	
	/*
	 * Keyword:--> Select dropdown using By locator reference
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void select_dropdown(By locator,String optioname)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(optioname);
	}
	
	
	/*
	 * Keyword:--> select dropdown using WebElement Interface reference
	 * 					[this keyword userfull for POM Framework]
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */
	public void select_dropdown(WebElement element,String option_name)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(element));
		new Select(Dropdown).selectByVisibleText(option_name);
	}
	

	/*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using xpath]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(String element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(element_xpath));
		 Element.click();
	 }
	 
	 
	 /*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using By class refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(By locator)
	 {
		 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		 Element.click();
	 }
	 
	 
	 /*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using WebElemnet refernce]    [POM keyword] 
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(WebElement element)
	 {
		 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(element));
		 Element.click();
	 }
	 
	 
	 
	 /*
	 * KeywordName:--> Mousehover on element.[Using By parameter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(By locator)
	 {
		 WebElement Element=driver.findElement(locator);
		 new Actions(driver).moveToElement(Element).pause(2000).perform();
	 } 
			
	 
	 /*
		 * KeywordName:--> Mousehover on element.[Using WebElement paramter]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void mousehover(WebElement element)
		 {
			 WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
			 new Actions(driver).moveToElement(Element).pause(2000).perform();
		 }
		 
		 
		 /*
		 * KeywordName:--> Fileupload using robot class
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void FileUploading(String filepath)
		 {
		 	String text=filepath;
			
			//Select String
			StringSelection Stext=new StringSelection(text);
			//Get default system clipboard
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//set content to clipboard at runtime.
			clipboard.setContents(Stext, Stext);
			
			
			//Crate object for Robot class
			Robot robot=null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.setAutoDelay(1000);
					
			//Press Ctrl+V to paste copied text into notepad file
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
					
			//Press enter key
			robot.keyPress(KeyEvent.VK_ENTER);
					
			//Release Control key
			robot.keyRelease(KeyEvent.VK_CONTROL);
	
		 }
		 
		 
		 /*
		 * KeywordName:--> CaptureScreen using [Filename]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void capturescreen(String imagename)
		 {
			try {
				 Thread.sleep(5000);
				//creating simple date format
				SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
				//get system default date
				Date d=new Date();
				//Convert system date using default format
				String time=df.format(d);
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void switchto_window(String Exp_windowtitle)
		 {
			//Get All dynamic window ID's
			Set<String> Allwindow_IDS=driver.getWindowHandles();
			
				//Iteate for all window times
				for (String EachWindowID : Allwindow_IDS) 
				{
					//Switch to Every window
					driver.switchTo().window(EachWindowID);
					//Capture every window title
					String Runtime_title=driver.getTitle();
					
					//Condition to accept on expected window title match
					if(Runtime_title.contains(Exp_windowtitle))
					{
						break;   //Stop Iteration and get execution control out of for loop.
					}
				  }		
			}
 
		 
	
	
}
