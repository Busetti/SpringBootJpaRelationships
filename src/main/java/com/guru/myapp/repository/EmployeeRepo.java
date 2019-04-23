/**
 * 
 */
package com.guru.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guru.myapp.model.Employee;

/**
 * @author bgurunath
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
