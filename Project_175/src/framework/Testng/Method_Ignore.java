package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore {
 
	  @Test(enabled=false) //Invoke method to run..
	  public void tc001() 
	  {
		  Reporter.log("Tc001 Executed",true);
	  }
	  
	  @Test //Invoke method to run..
	  public void tc002() 
	  {
		  Reporter.log("Tc002 Executed");
	  }
	  
	  @Test //Invoke method to run..
	  public void tc003() 
	  {
		  Reporter.log("Tc003 Executed");
	  }
}
