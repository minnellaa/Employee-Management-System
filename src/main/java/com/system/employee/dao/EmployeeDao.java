package com.system.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.employee.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
