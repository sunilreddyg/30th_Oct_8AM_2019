package switch_commands.Windows;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_From_Collections {

	public static void main(String[] args) 
	{
		
		/*
		 * Set Interface:-->
		 * 			Set is a unorder collection of objects.
		 */
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("GRID");
		set.add("WD");
		
		//Apply foreach to iterate
		for (String eachobject : set) 
		{
			System.out.println(eachobject);
		}
		
		
		
		
	}

}
