package com.capgemini.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.capgemini.beans.Employee;

@org.springframework.stereotype.Service
public class EmployeeService {


	List<Employee> empList=new ArrayList<>(Arrays.asList(
			new Employee(101,"Naman","Intern",50000),
			new Employee(102,"Nitin","Trainee",15000)));
	
	
	// Finding all the employees stored in list..
	public List<Employee> getAllEmployee()
	{
		return empList;
	}
	
	//Find the specific employee using id..
	public Employee getEmployee(int id)
	{
		return empList.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	
	public void addEmployee(Employee employee)
	{
		empList.add(employee);
	}
	
	
}
