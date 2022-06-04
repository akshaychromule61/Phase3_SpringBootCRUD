package com.spring.boot.mysql.connector.demo.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.mysql.connector.demo.daos.WorkerDao;
import com.spring.boot.mysql.connector.demo.models.Worker;
import com.spring.boot.mysql.connector.demo.utils.DatabaseConnection;

@Repository
public class WorkerRepository implements WorkerDao{
	private final Connection connection;
	
	@Autowired
	public WorkerRepository(DatabaseConnection connection) {
		super();
		this.connection = null;
		//this.connection = connection.getConnection();

	}

	@Override
	public Integer createWorker(Worker worker) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Worker findWorkerById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findWorkerCoutByDepartment(String Department) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Worker> findWorkersByDepartment(String Department) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Worker> findAllWorkers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateWorker(Worker worker) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateSalaryByDepartment(String Department, Integer bonusFactor) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteWorkerById(Integer Id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
