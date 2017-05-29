package com.sandeepdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Sandeep");
		map.put(100,"mahesh");
		map.put(1, "narendra");
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
