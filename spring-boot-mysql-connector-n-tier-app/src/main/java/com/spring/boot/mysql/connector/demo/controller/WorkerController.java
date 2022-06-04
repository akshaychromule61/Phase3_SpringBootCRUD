package com.spring.boot.mysql.connector.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.mysql.connector.demo.models.Worker;
import com.spring.boot.mysql.connector.demo.service.WorkerService;

@RestController  //takes request from web or Url not from console in JSON/text format sends the response
@RequestMapping("/api/worker")//all type of HTTP methods
public class WorkerController {
	@Autowired
	private WorkerService workerService;

	public WorkerController() {
		super();
	}
	
	@PostMapping("")
	public String create(@RequestBody Worker worker) {
		
		return null;
		
	}
	
	public String get(Integer id) {
		return null;
		
	}
	
}
