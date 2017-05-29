package com.sandeepdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LiskedListdemo {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("sandeep");
		list.add("Narendra");
		list.add("mahesh");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
