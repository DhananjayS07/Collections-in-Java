/*List allows Duplicate elements but set not allows so we use HashSet to remove duplicate elements
  it given output after apply Set(HashSet) with remove duplicate but not given in proper sorted order and not prserved insertion order*/
package com.dj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> a1=new ArrayList<String>();

		   a1.add("bbb");
		   a1.add("aaa");
		   a1.add("ccc");
		   a1.add("aaa");
		System.out.println(a1); //OUPUT of LIST [bbb, aaa, ccc, aaa]

		Set<String> s=new HashSet<>(a1); //By using HashSet we can remove duplicate element from List
		System.out.println(s); // OUTPUT of HashSet [aaa, ccc, bbb] not in sorted and insertion order also not preserved

	}

}
