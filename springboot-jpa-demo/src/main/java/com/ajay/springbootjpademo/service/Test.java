package com.ajay.springbootjpademo.service;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Interf{
	
	void getDetails();
	
}


class Employee{
	String name;
	int salary;
	
	
}


public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "ajay";
		emp.salary=1234;
		
		Employee emp2 = new Employee();
		emp2.name = "kumar";
		emp2.salary=2345;
		
		Map<String, Employee> map = new HashMap<>();
		map.put("ajay", emp);
		map.put("kumar", emp2);
		
		System.out.println(map);
		
		
		// TODO Auto-generated method stub
		
		/*
		 * 1234
		 * 5678
		 * 9101112
		 * 13141516
		 * 
		 * 
		 * 15 9 13 14 15 16 12 8 4 3 2 
		 */
		
		
		
		int[][] arr = new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		
		
		printSpiral(arr, arr.length);
		

	}

	private static void printSpiral(int[][] arr, int length) {
		//System.out.println(length);
		//starting column
		//int l=0;
		//int n=0;//ending column index
		//int i=0;
		int k=length;
		int l=length-1;
		
		int p=length-1;
		int j=0;
		int q=0;
		
		
		/*
		 * int[][] arr = new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		 */
		
		
		
		for(int i=0;i<k-1;i++) {
			System.out.print(" "+arr[i][q]);
		}
		q++;
		
		for(int i=0;i<=l;i++) {
			System.out.print(" "+arr[k-1][i]);
		}
		
		l--;
		
		for(int i=l;i>=0;i--) {
			System.out.print(" "+arr[i][p]);
		}
		p--;
		
		for(int i=p;i>length-k;i--) {
			System.out.print(" "+arr[j][i]);
		}
		j++;
		
		
		}
		
	}


