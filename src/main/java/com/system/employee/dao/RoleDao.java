package com.system.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.employee.model.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {

}
