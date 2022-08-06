package com.aparna.Employee_System;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
public class AppConfig {

	@Bean
	public Department getDepartment() {
		return new Department();
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
*/

@Configuration
@ComponentScan(basePackages="com.aparna.Employee_System")
public class AppConfig {

}