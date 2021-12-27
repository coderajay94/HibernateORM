package com.ajay.springbootjpademo.service;

import java.util.HashMap;
import java.util.Map;

public class MainService {

	public static void main(String[] args) {
		 int arr[][] = new int[][] {{1,3}, {1,3},{1,3},{3,1},{7,5},{9,9},{20,1}};
		 //[1,3],{5,7},{8,9},{3,1},{7,5},{9,9},{20,1}];
		 
		 repeatMatches2(arr);
		

	}

	private static void repeatMatches2(int[][] arr) {
		
		
		Map<Integer, int[]> map = new HashMap<>();
		int counter=0;
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("checking : "+arr[i]);
			if(map.containsValue(arr[i])) {
				System.out.println(arr[i]);
			}else {
				map.put(counter, arr[i]);
				counter++;
			}
		}

	}

	/*private static int[][] repeatMatches(int[][] arr) {
		int len = arr.length;
		int res[][] = new int[][];
		int count = 0;
		
		System.out.println("length: "+len);
		for(int i=0;i<len-1;i++)
		{
			int sum= arr[0][i] + arr[0][i+1];
			int diff = Math.abs(arr[0][i]-arr[0][i+1]);
			for(int j=i+1;j<len-2;j++) {
				
				if(arr[j][0]+arr[j][1]==sum && arr[j][0]-arr[j][1]==diff) {
					System.out.println("match found: "+arr[j]);
					res[count][0] = arr[j][0];
					res[count][1] = arr[j][1];
					count++;
				}
				
			}
			
		}
		
		
		return arr;
		
		
	}*/

}
