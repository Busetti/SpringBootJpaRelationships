/**
 * 
 */
package com.guru.myapp.service;

import java.util.List;

import com.guru.myapp.model.Employee;

/**
 * @author bgurunath
 *
 */
public interface EmployeeService {

	List<Employee> getAllEmployeeData();

	Employee createEmployee(Employee emp);

}
