package framework.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforAll_And_AfterAll 
{
	
	/*
	 * Note:--> BeforeAll and AfterAll annotaions comes with Static Access
	 * 			specifier,In this case we have declare any variable with
	 * 			static keyword.
	 */
	
	

	@BeforeAll //Invoke before first annoation [Precondition for class]
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class-Precondition");
	}

	@AfterAll //Invoke after final test annotation  [Post condition for class]
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class- post condition");
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
