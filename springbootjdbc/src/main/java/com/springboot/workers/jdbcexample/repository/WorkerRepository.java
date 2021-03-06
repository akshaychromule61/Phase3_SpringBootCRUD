package com.springboot.workers.jdbcexample.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.workers.jdbcexample.dao.WorkerDAO;
import com.springboot.workers.jdbcexample.model.Worker;
import com.springboot.workers.jdbcexample.utils.DatabaseConnection;

@Repository
public class WorkerRepository implements WorkerDAO{
	private final Connection con;
	
	
	public WorkerRepository() throws SQLException {
		super();
		this.con = DatabaseConnection.getConnection();
	}

	@Override
	public int add(Worker worker) throws SQLException {
		String insertQuery="insert into worker values(?,?,?,?,?,?,?)";
		
		try(PreparedStatement ps = con.prepareStatement(insertQuery)){
		ps.setInt(1, worker.getWorkerId());
		ps.setString(2, worker.getFirstName());
		ps.setString(3, worker.getLastName());
		ps.setInt(4, worker.getSalary());
		ps.setDate(5, worker.getJoiningDate());
		ps.setString(6, worker.getDept());
		ps.setString(7, worker.getEmail());
		
		int col=ps.executeUpdate();
		System.err.println(col+"Row Updated");
		return col;
		}
	}

	@Override
	public void delete(int workerId) throws SQLException {
		String delQuery=String.format("delete from worker where worker_id='%d'" , workerId);
		try(Statement stmt = con.createStatement()){
			int rowDel = stmt.executeUpdate(delQuery);
			System.out.println(rowDel+" Deleted");
		}		
	}

	@Override
	public Worker getWorker(int workerId) throws SQLException {
		String getWokerQuery=String.format("select * from worker where worker_id='%d'", workerId);
		Worker worker=null;
		try(Statement stmt=con.createStatement()) {
			ResultSet rs=stmt.executeQuery(getWokerQuery);
			while(rs.next()) {
				int id=rs.getInt(1);
				String fName=rs.getString(2);
				String lName=rs.getString(3);
				int salary=rs.getInt(4);
				Date jDate=rs.getDate(5);
				String dept=rs.getString(6);
				String email=rs.getString(7);
				worker = new Worker(id,fName,lName,salary,jDate,dept,email);
				
		}
		}
		return worker;
	}

	public List<Worker> getWorkers() throws SQLException {
		List<Worker> workers = new ArrayList<>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Worker");
		while(rs.next()) {
			int id=rs.getInt(1);
			String fName=rs.getString(2);
			String lName=rs.getString(3);
			int salary=rs.getInt(4);
			Date jDate=rs.getDate(5);
			String dept=rs.getString(6);
			String email=rs.getString(7);
			workers.add(new Worker(id,fName,lName,salary,jDate,dept,email));
		}
		return workers;
	}

	public void update(Worker worker) throws SQLException {
		String updateQuery="update worker set first_name=?,last_name=?salary=?jooining_date=?,department=?,email=? where worker_id=?";
		PreparedStatement ps=con.prepareStatement(updateQuery);
		ps.setString(1, worker.getFirstName());
		ps.setString(2, worker.getLastName());
		ps.setInt(3, worker.getSalary());
		ps.setDate(4, worker.getJoiningDate());
		ps.setString(5, worker.getDept());
		ps.setString(6, worker.getEmail());
		ps.setInt(7, worker.getWorkerId());
		
		int rowCount=ps.executeUpdate();
		System.out.println(rowCount+"Row Updated..");
		
	}

}
