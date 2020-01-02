package findElements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://cleartrip.com");			  
		driver.manage().window().maximize();
		
		
		//identifying location of footerlinks
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));

		//Get list of links under footer area..
		List<WebElement> Footer_links;
		Footer_links=Footer_Area.findElements(By.tagName("a"));
	
		boolean isValid=false;
		for (int j = 0; j < Footer_links.size(); j++) 
		{
			 WebElement Eachlink=Footer_links.get(j);
			 String Linhref=Eachlink.getAttribute("href");
			 //calling Reusable method with Parameter
			 isValid = getResponseCode(Linhref);
		
			 if(isValid==true)
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
			 else
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
		}
		

	}
	
	
	public static boolean getResponseCode(String urlString) 
	{
        boolean isValid = false;
        try {
            URL u = new URL(urlString);
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            h.connect();
            System.out.println(h.getResponseCode());
            if (h.getResponseCode() != 404) {
                isValid = true;
            }
        } catch (Exception e) {

        }
        return isValid;
    }

}
