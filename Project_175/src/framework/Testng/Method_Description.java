package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
	@Test(description="Verifying login with valid data")
	public void tc001()
	{
		Reporter.log("Tc001 Valid login verified");
	}
	
	
	@Test(description="verifying login with invalid data")
	public void tc002()
	{
		Reporter.log("Tc002 Invalid login verified");
	}
	
	
	@Test
	public void Verify_login_without_data()
	{
		Reporter.log("without login verified");
	}

}
