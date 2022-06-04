package com.spring.boot.mysql.connector.demo.daos;

import java.sql.SQLException;
import java.util.List;

import com.spring.boot.mysql.connector.demo.models.Worker;

public interface WorkerDao {
	//Create
	Integer createWorker(Worker worker) throws SQLException ;
	//Read or retrieve the records
	Worker findWorkerById(Integer id) throws SQLException ;
	Integer findWorkerCoutByDepartment(String Department) throws SQLException;
	List<Worker> findWorkersByDepartment(String Department) throws SQLException;
	List<Worker> findAllWorkers() throws SQLException;
	//Update
	Integer updateWorker(Worker worker) throws SQLException;
	Integer updateSalaryByDepartment(String Department, Integer bonusFactor) throws SQLException;
	//Delete
	Integer deleteWorkerById(Integer Id) throws SQLException;
	
}
