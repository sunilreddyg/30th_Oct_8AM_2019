package framework.Junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class BeforeEach_And_AfterEach {

	@BeforeEach  //Invoke before each @Test annotation method.
	void setUp() throws Exception 
	{
		System.out.println("method-Precondition");
	}

	@AfterEach    //Invoke After each @Test annoation method.
	void tearDown() throws Exception 
	{
		System.out.println("method-postcondition"+"\n");
	}
	

	@Test //invoke method to run.
	void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test //invoke method to run.
	void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test //invoke method to run.
	void test3() 
	{
		System.out.println("test3 executed");
	}
	
	
	


}
