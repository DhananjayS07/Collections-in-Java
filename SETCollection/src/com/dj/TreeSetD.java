package com.dj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetD {

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
		
		System.out.println("\nBy using TreeSet<>()"); // TreeSet will sort and remove all dupliacte elements
		
		Set<String> s2=new TreeSet<String>(a1);
		System.out.println(s2);

	}

}
