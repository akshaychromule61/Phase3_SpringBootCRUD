package com.springboot.workers.jdbcexample.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.jdbcexample.utils.DateTimeUtilities;

@RestController
public class HomeController {
	
	public String index() {
		return "Hello visitor!\\nVisiting time: "+DateTimeUtilities.getTimeStamp();
	}
}
