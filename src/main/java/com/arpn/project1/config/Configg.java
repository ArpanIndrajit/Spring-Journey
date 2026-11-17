package com.arpn.project1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.arpn.project1.emp.Employee;

@Configuration
@ComponentScan(basePackages = "com.arpn.project1.empmnger")
public class Configg {
	
	@Bean
	public Employee empl1() {
		return new Employee("Arpan");
	}
	@Bean
	public Employee empl2() {
		return new Employee("Madhu");
	}

}
