package framework.Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Pre_And_post_Condition {
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method"+"\n");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class");
  }
  
  
	  @Test //Invoke method to run..
	  public void tc001() 
	  {
		  Reporter.log("Tc001 Executed",true);
	  }
	  
	  @Test //Invoke method to run..
	  public void tc002() 
	  {
		  Reporter.log("Tc002 Executed",true);
	  }
	  
	  @Test //Invoke method to run..
	  public void tc003() 
	  {
		  Reporter.log("Tc003 Executed",true);
	  }

}
