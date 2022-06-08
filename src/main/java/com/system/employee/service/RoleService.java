package com.system.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.employee.dao.RoleDao;
import com.system.employee.model.Role;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;

	public Role creatEmployeeRole(Role role) {
		return roleDao.save(role);
	}
	
	public Iterable<Role> getAllRoles(){
		return roleDao.findAll();
	}

}
