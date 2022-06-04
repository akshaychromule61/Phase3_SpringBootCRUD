package com.springboot.workers.jdbcexample.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.jdbcexample.model.Worker;
import com.springboot.workers.jdbcexample.repository.WorkerRepository;
@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	WorkerRepository workerRepo;
	
	@GetMapping("/showworker")
	public Worker showWorker() {
	try {
		return workerRepo.getWorker(1);
	}catch(SQLException ex) {
		ex.printStackTrace();
		return null;
	}
	}
	@GetMapping("/all/showworkers")
	public List<Worker> showWorkers(){
		try {
			return workerRepo.getWorkers();
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	@GetMapping("/create")
	public String Create() {
		try {
			Worker worker = new Worker(10,"Akshay","Chormule",5000,Date.valueOf("2022-03-15"),"IE","ak@gmail.com");
			workerRepo.add(worker);
			return worker.getFirstName()+"Sussuccfully Added record...";
		}catch(SQLException ex) {
			ex.printStackTrace();
			return "Unable to add yu records...WorkerController class";
		}
	}
	@GetMapping("/update")
	public String update() {
		Worker worker = new Worker(9, "Satya", "Sri", 5000,Date.valueOf("2022-03-31"), "SD", "bat.satya@gmail.com");
		try {
			workerRepo.update(worker);
			return "Record updated successfully.";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error while updating record...";
		}
		
	}
	@GetMapping("/delete")
	public String delete() {
		try {
			workerRepo.delete(7);
			return "Record deleted successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Unable to record...";
		}
		
	}
}
