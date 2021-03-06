package com.creationmachine.service;

import java.util.List;

import com.creationmachine.model.Employee;

public interface EmployeeService {

	Employee findById(int id);
	
	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployeeBySsn(String ssn);

	List<Employee> findAllEmployees(); 
	
	Employee findEmployeeBySsn(String ssn);
	
	List<Employee> findEmployeesByBranch(String branch);

	boolean isEmployeeSsnUnique(Integer id, String ssn);
	
}
