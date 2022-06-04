package com.springboot.workers.jdbcexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkersJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkersJdbcApplication.class, args);
		System.out.println("Spring boot n-tier app with JDBC and MySQL DB works!!");

	}

}
