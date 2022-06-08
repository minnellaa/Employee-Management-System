package com.system.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.employee.model.Role;
import com.system.employee.service.RoleService;

@RestController
@RequestMapping("/employeerole")
public class EmployeeRoleController {

	@Autowired
	private RoleService roleService;

	@PostMapping("/create")
	public Role createEmployeeRole(@RequestBody Role roleObj) {
		return roleService.creatEmployeeRole(roleObj);
	}

	@GetMapping("/getAll")
	public Iterable<Role> getAllRole() {
		return roleService.getAllRoles();
	}
}
