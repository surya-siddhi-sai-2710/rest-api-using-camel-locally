package com.example.service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.example.model.Employees;

@Service("employeeService")
public class EmployeeServiceImp implements EmployeeService{
private final Map<Integer, Employees> employees = new TreeMap<>();
	
//	Constructor to create default values
	 public EmployeeServiceImp() {
		
		employees.put(1, new Employees(1, "Gullivers Travels", 10));
		employees.put(2, new Employees(2, "Frankenstein", 5));
		employees.put(3, new Employees(3, "Harry Potter", 100));
	}

	@Override
	public Collection<Employees> getEmployees() {
		return employees.values();
	}

	@Override
	public Employees getEmployee(int eid) {
		return employees.get(eid);
	}

	@Override
	public void addEmployee(Employees employee) {
		
		int size = employees.size();
		employees.put(size+1, employee);
	}
}
