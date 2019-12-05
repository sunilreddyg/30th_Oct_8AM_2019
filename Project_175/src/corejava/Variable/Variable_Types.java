package corejava.Variable;

public class Variable_Types 
{
	int age=20;  //Instant variable
	static double price=1200.00;  //Class variable
	
	//Instant method
	public void method1()
	{
		String name="MQ";  //Local Variable.
		System.out.println("method1 executed");
	}
	
	//Class method
	public static void method2()
	{
		System.out.println("method2 executed");
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Inorder to call Instant methods & variables we
		 * should create object for class.
		 */
		Variable_Types obj=new Variable_Types();
		obj.method1();  
		int x=obj.age;
		System.out.println("Person age is => "+x);
		
		/*
		 * Inorder to call Class Method & varaibles from same
		 * class no need of object creation.
		 */
		method2();
		double Current_price=price;
		System.out.println("Current product price is => "+Current_price);

	}

}
