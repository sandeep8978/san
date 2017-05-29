package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class simple {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"ajay", 25));
		al.add(new Student(101,"sandeep", 15));
		al.add(new Student(101,"narendra", 19));
		System.out.println("Sorting by name.....:");
		Collections.sort(al, new NameComparator());
		for(Student st:al){
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}
		System.out.println("Sorting by age....");
		Collections.sort(al, new AgeComparator());
		for(Student st:al){
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}

	}

}
