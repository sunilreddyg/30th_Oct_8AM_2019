package framework.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit_With_Webdriver 
{
	static WebDriver driver;
	static String filepath="drivers//";
	String url="http://facebook.com";
	
	
	
	@Test
	public void Tc001_Singup_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Singup link verified");
	}
	
	
	@Test
	public void Tc002_SingIn_link()
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login link verified");
	}
	
	
	@Test
	public void Tc003_Messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger link verified");
	}
	
	
	
	@BeforeAll  //Invoke before first @Test annoation  And @BeforeEach annotation
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		//Close browser
		driver.close();
	}

	@BeforeEach
	void setUp() throws Exception
	{
		driver.get(url);
	}

	@AfterEach
	void tearDown(TestInfo testInfo) throws Exception 
	{
		//This syntax capture consturcted method name
		String methodName = testInfo.getTestMethod().get().getName();

		//Capture screen and converting into file format.
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dumping file into local utilities..
		FileUtils.copyFile(src, new File("screens\\"+methodName+".png"));
	}



}
