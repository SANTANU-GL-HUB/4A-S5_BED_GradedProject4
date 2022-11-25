package com.greatlearning.EmployeeManagement2.service;

import java.util.List;

import com.greatlearning.EmployeeManagement2.entity.Role;


public interface RoleService {

	// Save operation Create
    Role saveRole(Role role);
 
    // Read operation
    List<Role> fetchRoleList();
 
    // Update operation
    Role updateRole(Role role,Integer Id);
 
    // Delete operation
    void deleteRoleById(Integer Id);
	
}
