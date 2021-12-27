package com.ajay.springbootjpademo.service;

public class Parent {

	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.m1(null);
		
	}
	
}


class Child extends Parent {

	void m1(String s) {
		System.out.println("String method");
	}
	void m1(Object s) {
		System.out.println("Object method");
	}
}