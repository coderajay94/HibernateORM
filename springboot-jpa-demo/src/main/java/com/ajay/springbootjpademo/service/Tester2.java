package com.ajay.springbootjpademo.service;

import java.util.HashMap;
import java.util.Map;

public class Tester2 {

	public static void main(String[] args) {
		String s = "ajay";
		String s2 = new String("ajay");
		
		System.out.println(s.hashCode() +" and "+s2.hashCode());
		System.out.println(s.equals(s2));
		
		Map<String, String> map = new HashMap<>();
		map.put(s, "kumar");
		map.put(s2, "kumar2");
		
		System.out.println(map);
		

	}

}
