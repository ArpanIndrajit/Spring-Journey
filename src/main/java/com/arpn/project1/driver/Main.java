package com.arpn.project1.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arpn.project1.config.Configg;
import com.arpn.project1.empmnger.EmployeeManager;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configg.class);
		
		EmployeeManager employeeManager= context.getBean(EmployeeManager.class);
		
		employeeManager.display();
	}

}