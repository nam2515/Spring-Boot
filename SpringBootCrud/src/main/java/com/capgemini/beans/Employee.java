package com.capgemini.beans;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Employee {
	@Id
	@NotBlank(message="Id is mandatory")
	private int id;
	@NotBlank(message="Name is mandatory")
	String name;
	@NotBlank(message="Designation is mandatory")
	String designation;
	@NotBlank(message="Salary is mandatory")
	int salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
