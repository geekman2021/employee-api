package com.arkeup.employee_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bonjours");
	}
}
