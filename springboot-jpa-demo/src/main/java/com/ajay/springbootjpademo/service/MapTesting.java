package com.ajay.springbootjpademo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTesting {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("ajay");
		list.add("kumar");
		
		
		 List<String> sorted = list.stream().sorted().collect(Collectors.toList());
		 
		//  sorted.forEach(System::println());
		
	}

}
