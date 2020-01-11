package extend_Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Using_ScreenShot {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver;
		String driver_path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		String Filepath="Reports\\Report1.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");
			
			ExtentTest test1=logger.startTest("Tc001_loginvalid");
			
				String screen1_path="C:\\Users\\Administrator\\git\\30th_Oct_8AM_2019\\Project_175\\screens\\Screen1.png";
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File(screen1_path));
				
				test1.log(LogStatus.PASS, "HomeScreen Displayed"
				+test1.addScreenCapture(screen1_path));
			
			logger.endTest(test1);
			
		
				
		logger.flush();

	}

}
