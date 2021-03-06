package com.spring.boot.mysql.connector.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
	private Connection connection=null;
	//All these db. properties defined in application.properties
	public DatabaseConnection(@Value("${db.url}") String url,
							  @Value("${db.username}") String username,
							  @Value("${db.password}") String password) throws SQLException{
		super();
		this.connection=DriverManager.getConnection(url,username,password);	
}
}