package com.guru.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.myapp.model.Employee;
import com.guru.myapp.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public List<Employee> getAllEmployeeData() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

}
