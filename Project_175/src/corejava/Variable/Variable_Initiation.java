package corejava.Variable;

public class Variable_Initiation 
{

	public static void main(String[] args)
	{
		
		
		//Local Initiation with in Condition.
		if(true)
		{
			int a=100;
			System.out.println("Inside condition => "+a);
		}
		
		
		//Global Initiation at Condition Statements
		int b;
		if(true)
		{
			b=200;
			System.out.println("Inside Condition b value is => "+b);
			b=300;
		}
		System.out.println("outside condition b value is => "+b);
		
		
	
		

	}

}
