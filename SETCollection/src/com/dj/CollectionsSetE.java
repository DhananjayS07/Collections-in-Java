package com.dj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a1=new ArrayList<String>();

		   a1.add("bbb");
		   a1.add("aaa");
		   a1.add("ccc");
		   a1.add("aaa");
		System.out.println(a1); //OUPUT of LIST [bbb, aaa, ccc, aaa]

		System.out.println("\nBy using HASHSet<>()");
		
		Set<String> s=new HashSet<>(a1); //Randomly print without index
		System.out.println(s); // 
		
		System.out.println("\nBy using LinkedHashSet<>()");
		
		Set<String> s1=new LinkedHashSet<>(a1);  // insertion order is preserved and remove all duplicate elements
		System.out.println(s1);
		
		System.out.println("\nBy using TreeSet<>()"); 
		
		Set<String> s2=new TreeSet<String>(a1); // TreeSet will sort and remove all dupliacte elements
		System.out.println(s2);
		
		System.out.println("\nBy using Collections.sort()"); 
		Collections.sort(a1); // I want sorting but not want to remove duplicate (this called utility class or utility method)
		System.out.println(a1);

	}

}

/* 
 By using Simple ArrayList
 [bbb, aaa, ccc, aaa]

By using HASHSet<>()
[aaa, ccc, bbb]

By using LinkedHashSet<>()
[bbb, aaa, ccc]

By using TreeSet<>()
[aaa, bbb, ccc]

By using Collections.sort()
[aaa, aaa, bbb, ccc]
*/
