package robot_window_Interfaces;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_Robot {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Get system default dimension
		Dimension Sys_screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Create Screen using Robot
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Sys_screen_Dimension));
		
		String image_location="C:\\Users\\Administrator\\git\\My_robot.png";
		ImageIO.write(Image, "PNG", new File(image_location));	
		
		

	}

}
