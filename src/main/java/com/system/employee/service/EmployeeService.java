package com.system.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.employee.dao.EmployeeDao;
import com.system.employee.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Employee createEmployee(Employee employee) {

		return employeeDao.save(employee);
	}
	
	public Iterable<Employee> getAllEmployees(){
		
		return employeeDao.findAll();
	}
}
