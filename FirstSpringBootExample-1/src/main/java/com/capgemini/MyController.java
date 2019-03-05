package com.capgemini;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/hello")
	public String getString()
	{
		return "Hello from spring boot";
	}
}
