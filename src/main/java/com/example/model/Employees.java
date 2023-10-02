package com.example.model;

public class Employees {
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	private int eid;
	private String name;
	private int salary;
	
	public Employees(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
