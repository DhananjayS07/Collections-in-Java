package com.dj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<>();

	    s.add(10);
	    s.add(20);
	    s.add(10);
	    s.add(30);

	System.out.println(s); //Output:20,30,10   ---No duplicate element---

	System.out.println("\n******By using Iterator******");
	
	Iterator<Integer> itr=s.iterator();  // ----By using Itertor----
	  while(itr.hasNext())
	   {
	     int x=itr.next();
	    
	     System.out.println(x);
	  }

	System.out.println("\n******By using For loop******");
	
	for(int x : s)
	{
		System.out.println(x);     //// ---By using Enhanced For Loop-----
	}

}
}
