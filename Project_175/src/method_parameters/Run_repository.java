package method_parameters;

import org.openqa.selenium.By;

public class Run_repository 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_app("http://facebook.com");
		obj.set_timeout(30);
		
		obj.Enter_text("//input[@name='firstname']", "Arjun");
		obj.Enter_text("//input[@name='lastname']", "Kumar");
		
		
		By Email_loc=By.cssSelector("#u_0_r");
		By Retype_email_loc=By.id("u_0_u");
		obj.Enter_text(Email_loc, "Arjunkumar@gmail.com");
		obj.Enter_text(Retype_email_loc, "Arjunkumar@gmail.com");
		
		//selecting dropdown using keywords
		obj.select_dropdown("//select[@title='Day']", "15");
		obj.select_dropdown(By.id("month"), "May");
		obj.select_dropdown("//select[@name='birthday_year']", "1990");
		
		obj.capturescreen("Registration");
		
		obj.click_element(By.linkText("Instagram"));
		Thread.sleep(5000);
		
		obj.switchto_window("Instagram");
		Thread.sleep(5000);
		
		obj.capturescreen("Insta window");
	}

}
