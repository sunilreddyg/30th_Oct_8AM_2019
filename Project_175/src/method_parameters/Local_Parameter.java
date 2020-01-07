package method_parameters;

public class Local_Parameter 
{
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//Method with local parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	
	//Method with local parameter
	public void print_tool(String toolname,double price)
	{
		String name=toolname;
		System.out.println(name+"  "+price);
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		//Create objet for class
		Local_Parameter obj=new Local_Parameter();
		//Calling instant method
		obj.print_tool();
		
		//Calling method with single argument
		obj.print_tool("IDE");
		obj.print_tool("Appium");
		
		//calling method with multiple arguments
		obj.print_tool("Cucumber", 4000.00);
	}

}
