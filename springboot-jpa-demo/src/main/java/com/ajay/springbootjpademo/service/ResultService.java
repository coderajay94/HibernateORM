package com.ajay.springbootjpademo.service;

import org.springframework.web.client.RestTemplate;


public class ResultService {

	
	static RestTemplate restTemplate = new RestTemplate();
	
	
	public static void main(String args[]) {
		
		System.out.println(getResults());
		
	}
	public static String getResults() {
		String response ="";
		
		
		response = restTemplate.getForEntity("https://randomuser.me/api/", String.class).toString();
		
		return response;
	}

	
	
}
