package com.guru.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guru.myapp.model.Employee;
import com.guru.myapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@GetMapping("/AllEmployees")
	@ResponseBody
	public List<Employee> getAllEmployeeData() {

		List<Employee> empList = empService.getAllEmployeeData();

		return empList;

	}
	
	@PostMapping("/Create-Emp")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		
		Employee employee = empService.createEmployee(emp);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	

}
