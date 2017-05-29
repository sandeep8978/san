package com.sand;

import java.util.ArrayList;
import java.util.Collections;

public class comparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"sandeep",25));
		al.add(new Student(102,"narendra",24));
		Collections.sort(al);
		for(Student st:al){
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}

	}

}
