package ComparatorA;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.dj.compartor.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> s=null;
		
		System.out.println("---Select--\n"
		                   +"1.Rollno sort \n"
				           +"2.Name Sort");
		
		Scanner sc=new Scanner(System.in);
		
		int ch=sc.nextInt();
		
		if(ch==1) {
			Comparator<Student> crno= (o1,o2)->o1.getRollno()-o2.getRollno();
			s=new TreeSet<>(crno);
			
		}
		else if(ch==2) {
			Comparator<Student> crno= (o1,o2)->o1.getName().compareTo(o2.getName());
			s=new TreeSet<>(crno);
		}
		
Student stu1=new Student();
		
		stu1.setRollNo(2);
		stu1.setName("ccc");
		
		Student stu2=new Student();
		
		stu2.setRollNo(1);
		stu2.setName("bbb");
		
		Student stu3=new Student();
		
		stu3.setRollNo(3);
		stu3.setName("aaa");
		System.out.println("Data Added sucesssfully in Set by user by using set and get");
		s.add(stu1);
		s.add(stu2);
		s.add(stu3);
		
		for(Student st : s) {
			System.out.println(st.getRollno());
			System.out.println(st.getName());
		}
		
		
		
		
		
        sc.close();
	}
      
}
