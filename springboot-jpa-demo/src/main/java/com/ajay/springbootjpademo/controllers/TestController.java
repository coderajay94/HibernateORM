package com.ajay.springbootjpademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.springbootjpademo.service.ResultService;


@RestController
@RequestMapping("/random")
public class TestController {
	
	
	@Autowired
	ResultService resultService;
	
	@RequestMapping("/api")
	public String getResult() {
		return resultService.getResults();
	}
	

}
