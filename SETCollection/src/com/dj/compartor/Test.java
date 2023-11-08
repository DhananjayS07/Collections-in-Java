package com.dj.compartor;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> s=new TreeSet();
		
		Student stu1=new Student();
		
		stu1.setRollNo(2);
		stu1.setName("ccc");
		
		Student stu2=new Student();
		
		stu2.setRollNo(1);
		stu2.setName("bbb");
		
		Student stu3=new Student();
		
		stu3.setRollNo(3);
		stu3.setName("aaa");
		
		s.add(stu1);
		s.add(stu2);
		s.add(stu3);
		
		for(Student st : s) {
			System.out.println(st.getRollno());
			System.out.println(st.getName());
		}
		

	}

}
