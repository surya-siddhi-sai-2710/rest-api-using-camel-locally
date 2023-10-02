package com.example.service;

import java.util.Collection;

import com.example.model.Employees;

public interface EmployeeService {
	
	Collection<Employees> getEmployees();
	
	Employees getEmployee(int eid);
	
	void addEmployee(Employees employee);
}
