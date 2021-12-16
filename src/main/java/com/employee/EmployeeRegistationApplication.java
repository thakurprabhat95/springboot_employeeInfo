package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootConfiguration,@EnableAutoConfiguration,@ComponentScan
public class EmployeeRegistationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistationApplication.class, args);
	}

}
