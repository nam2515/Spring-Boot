package com.capgemini;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.EmployeeBean;

@RestController
public class MyController {


	@RequestMapping("/hello1")
	public EmployeeBean getEmployee()
	{
		EmployeeBean emp=new EmployeeBean();
		emp.setName("Naman");
		emp.setId(101);
		return emp;
	}
}
