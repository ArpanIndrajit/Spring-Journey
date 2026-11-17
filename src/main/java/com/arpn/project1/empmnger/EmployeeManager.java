package com.arpn.project1.empmnger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arpn.project1.emp.Employee;
@Component
public class EmployeeManager {
	
	@Autowired
	@Qualifier("empl2")
	Employee employee;
	   public void display() {
	        System.out.println(employee);
	    }
}