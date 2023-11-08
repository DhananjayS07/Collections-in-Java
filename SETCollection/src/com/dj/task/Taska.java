package com.dj.task;

import java.util.*;

public class Taska {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<>();

    s.add("Java");
    s.add("Python");
    s.add("HTML");
    s.add("JavaScript");
	    s.add("Cobol");
	    s.add("CSS");
	    s.add("C");
	    s.add("C++");

	System.out.println(s); //  ---No duplicate element---

	System.out.println("\n******By using Iterator******");
	
	Iterator<String> itr=s.iterator();  // ----By using Itertor----
	  while(itr.hasNext())
	   {
	     String x=itr.next();
	    
	     System.out.println(x);
	  }

	  System.out.println("\n******By using For loop******");
		
		for(String x : s)
		{
			System.out.println(x);     //// ---By using Enhanced For Loop-----
		}
	
	 System.out.println("\n******By using Reverse");
	 
		 //First way to convert set to list and then use collection.reverse()
		 List<String> myList = new ArrayList<>();
		   
		 myList.addAll(s);
		 
		 Collections.reverse(myList);
		 
		 System.out.println(s);
		 
		
		
		
		
		
		/*Set<Integer>s=new HashSet<>();
		  s.add(20);
		  s.add(20);
		  s.add(30);
		  s.add(90);
		  s.add(80);
		  
		  System.out.println(s); */
		  
		 
		  
		  
		 /* ArrayList<Integer>a=new ArrayList<>();
		  
		     a.addAll(s);
		     
		     System.out.println(a);
		     
		     Collections.reverse(a);
		     System.out.println(a);*/
		  
		  
		  
		
		 
		 
	}
	
	
	

}
