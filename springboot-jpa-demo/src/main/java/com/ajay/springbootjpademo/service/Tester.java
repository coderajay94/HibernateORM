package com.ajay.springbootjpademo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {
		
		
		List<Employees> employeeList = new ArrayList<Employees>();

		employeeList.add(new Employees(111, "Jiya Brein", 12, "Female", "HR", 2011, 25000.0f));
		employeeList.add(new Employees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0f));
		employeeList.add(new Employees(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0f));
		employeeList.add(new Employees(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0f));
		employeeList.add(new Employees(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0f));
		employeeList.add(new Employees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0f));
		employeeList.add(new Employees(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0f));
		employeeList.add(new Employees(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0f));
		employeeList.add(new Employees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0f));
		employeeList.add(new Employees(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5f));
		employeeList.add(new Employees(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0f));
		
		;
		//System.out.println(employeeList.stream().filter(e-> e.getAge()>22).count());
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(10);
		list.add(45);
		list.add(121);
		list.add(145);
		list.add(102);
		list.add(46);
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		long count = list.stream().filter((l)->l>45).count();
		System.out.println(count);
		
		long distinctCount = list.stream().distinct().count();
		System.out.println(distinctCount);
		
		//give grace marks using map
		System.out.println("without graced marks"+list);
		List<Integer> map = list.stream().map(e-> e+5).collect(Collectors.toList());
		System.out.println("with graced marks"+map);
		
		Comparator<Integer> c = (obj1, obj2)-> {return obj1>obj2?-1:obj2>obj1?+1:0;};
		Comparator<Integer> c2 = (obj1, obj2)-> {return -obj1.compareTo(obj2);};
		
		
		System.out.println(list.stream().sorted(c).collect(Collectors.toList()));
		
		System.out.println("--------------------------");
		
		List<String> names	 = new ArrayList<String>();
		names.add("raghu");
		names.add("ajay");
		names.add("zo");
		names.add("bizuka");
		
		Comparator<String> len = (obj1, obj2)-> {
			int len1= obj1.length();
			int len2= obj2.length();
			
			if(len2>len1 ) return -1;
			if(len1>len2) return 1;
			else return obj1.compareTo(obj2);
			
		};
		
		
		
		// List<String> sortedNames = names.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
		List<String> sortedNames= names.stream().sorted(len).collect(Collectors.toList());
			
			System.out.println(sortedNames);
			 Optional<String> name= names.stream().max(len);
			
			System.out.println(name.get());
		
		//System.out.println(employeeList);
		
			
			
	}

}
