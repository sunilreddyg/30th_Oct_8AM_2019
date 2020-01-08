package method_return_types;

import org.openqa.selenium.By;

public class Run_Repository 
{
	
	public static void main(String args[])
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_app("http://facebook.com");
		obj.set_timeout(50);
		
		
		if(obj.isTitle_presented("Facebook"))
			System.out.println("title is presented");
		else
			System.out.println("title mismatch for facebook page");
		
		
		if(obj.is_urlpresented("https://www.facebook.com/"))
			System.out.println("url match found");
		else
			System.out.println("url mismatch for fb homepage");
		
		
		if(obj.is_Element_presented("email"))
			obj.Enter_text(By.id("email"), "9030248855");
		else
			System.out.println("element not found at source");
		
		
		if(obj.istext_visible_at_webpage("Create an account"))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
		By Label_Female=By.xpath("//label[contains(.,'Female')]");
		if(obj.is_text_presented_At_Element(Label_Female, "Female"))
			System.out.println("text presened at location");
		else
			System.out.println("text not presented at location");
		
		
		By Email_loc=By.id("email");
		if(obj.isInput_presented_At_Editbox(Email_loc, "9030248855"))
			System.out.println("input presented at editbox");
		else
			System.out.println("Input not presented at editbox");
		
		
		
	}

}
