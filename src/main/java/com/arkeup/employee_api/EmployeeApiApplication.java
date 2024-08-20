package com.arkeup.employee_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApiApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeApiApplication.class);

	public static void main(String[] args){
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

	@Override
	public void run (String[] args) {
		logger.warn("this is a warning");
	}
}
