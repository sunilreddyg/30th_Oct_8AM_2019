package switch_commands.Windows;

import java.util.HashSet;
import java.util.Iterator;
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
		
		
		
		Set<String> col=new HashSet<String>();
		col.add("one");
		col.add("two");
		col.add("three");
		col.add("four");
		
		//Convert Colletion of object into iterators
		Iterator<String> itr=col.iterator();
		
		//Read Each iterator using Next keyword
		
		String obj1=itr.next();
		System.out.println(obj1);
		
		String obj2=itr.next();
		System.out.println(obj2);
		
		String obj3=itr.next();
		System.out.println(obj3);
		
		String obj4=itr.next();
		System.out.println(obj4);
		
		
		
		//Unorder collection of objects....
		Set<String> group=new HashSet<String>();
		group.add("firefox");
		group.add("chrome");
		group.add("ie");
		
		
		//Convert Colletion of object into iterators
		Iterator<String> iterators=group.iterator();
		
		//Read all Iterators using Conditional loop
		while(iterators.hasNext())
		{
			 String obj=iterators.next();
			 System.out.println("=> "+obj);
		}
		
		
		
	}

}
