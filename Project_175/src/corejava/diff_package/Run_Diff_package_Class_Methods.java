package corejava.diff_package;

import corejava.StaticMethods.InputDevices;
import corejava.instant_methods.Robot;

public class Run_Diff_package_Class_Methods 
{

	public static void main(String[] args) 
	{
		/*
		 * calling Instant method from diff package
		 * 		=> We should import package first
		 * 		=> Then call instant method in regular format
		 */
		Robot obj=new Robot();
		obj.walk();
		obj.run();
		
		
		InputDevices.keyboard();
		InputDevices.mouse();
		

	}

}
