package com.spring.boot.mysql.connector.demo.models;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Worker implements Comparable<Worker> {
	Integer workerId;
	String firstName;
	String lastName;
	Integer salary;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	Timestamp joiningDate;
	String department;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(Integer workerId, String firstName, String lastName, Integer salary, String department) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}
	
	public Worker(Integer workerId, String firstName, String lastName, Integer salary, Timestamp joiningDate,
			String department) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.department = department;
	}
	
	public Integer getWorkerId() {
		return workerId;
	}
	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Timestamp getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Timestamp joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int compareTo(Worker worker) {
		// TODO Auto-generated method stub
		return this.workerId = worker.getWorkerId();
	}
	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", joiningDate=" + joiningDate + ", department=" + department + "]";
	}
	
	
}
