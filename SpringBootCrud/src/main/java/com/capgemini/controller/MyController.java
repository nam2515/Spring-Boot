package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Employee;
import com.capgemini.service.EmployeeService;


@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/empList")
	public List<Employee> getAllTopics()
	{
	   return employeeService.getAllEmployee();
	}

	@RequestMapping("/empList/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
	  return employeeService.getEmployee(id);
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/empList")
	public void addTopic(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}

}
