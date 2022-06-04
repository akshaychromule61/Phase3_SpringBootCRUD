package com.spring.boot.mysql.connector.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.mysql.connector.demo.daos.WorkerDao;

@Service
public class WorkerService {
	private WorkerDao workerRepository;

	@Autowired
	public WorkerService(WorkerDao workerRepository) {
		super();
		this.workerRepository = workerRepository;
	}
	
}
