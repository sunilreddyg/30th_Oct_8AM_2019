package corejava.Variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Var_Global_initiation 
{
	WebDriver driver=null;
	String drivers_path;
	public String url="http://google.com";
	private final String keycode="112313";  //Variable type is final it can't be ovverride.
	
	//Before launch browser we should assign driverpath at runtime.
	public void Launch_browser()
	{
		 System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	
	public void load_webpage()
	{
		//before calling loadwebpage method, we should call launch browser to
		//initiate browser to driver varable
		driver.get(url); 
		System.out.println(keycode);
	}
	

	public static void main(String[] args) 
	{
		//Create object for class
		Var_Global_initiation obj=new Var_Global_initiation();
		
		//Add Value to Variable at runtime
		obj.drivers_path="drivers\\";
		obj.Launch_browser();
		
		obj.url="http://facebook.com";
		obj.load_webpage();
		
	}

}
