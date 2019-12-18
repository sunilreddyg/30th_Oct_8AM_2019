package capture_Screen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_When_Alert_Presented {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();      	 //maximize browser window
			
		//Invalid Action clicking witout mandatory fields selection
		WebElement Search_button=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_button.click();
		Thread.sleep(3000);
		

		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Get system default dimension
		Dimension Sys_screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Create Screen using Robot
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Sys_screen_Dimension));
		
		String image_location="C:\\Users\\Administrator\\git\\My_alert.png";
		ImageIO.write(Image, "PNG", new File(image_location));	
		
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
