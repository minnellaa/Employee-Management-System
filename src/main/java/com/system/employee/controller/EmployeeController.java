package com.system.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.employee.model.Employee;
import com.system.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employeeObj) {

		return employeeService.createEmployee(employeeObj);
	}

	@GetMapping("/getAll")
	public Iterable<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}
}
