package framework.Junit.Junit4_TestMethod;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Junit4_Test_Retrieve_Example {

	//In juit 4 @Rule annotation allows to get  @Test annotation methodname
	//@Rule must be public..
	public @Rule TestName test=new TestName();
	
	@After
	public void tearDown() throws Exception 
	{
		//Get Current Constructed method name
		System.out.println(test.getMethodName());
	}

	@Test
	public void Tc001_Login_valid() 
	{
		
	}
	
	
	@Test
	public void Tc002_Login_Invalid() 
	{
		
	}

}
