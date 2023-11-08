/* By Using Comparable */
package com.dj.compartor;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	public int getRollno(){
		
		return rollno;
	}
	
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}
