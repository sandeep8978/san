package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(101,"sandeep",25);
		Student s2=new Student(100,"narendra",28);
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			
		
		Student st=(Student)itr.next();
		System.out.println(st.rollno+" "+st.name+"  "+st.age);
		
//		for(Student st:al){
//			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}
}

//}
