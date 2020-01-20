package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Priority 
{
	
  @Test(priority=0)
  public void f() 
  {  
	  Reporter.log("f method executed ",true);
  }
  
  @Test(priority=1)
  public void x() 
  {  
	  Reporter.log("x method executed ",true);
  }
  
  @Test(priority=2)
  public void a() 
  {  
	  Reporter.log("a method executed ",true);
  }
}
