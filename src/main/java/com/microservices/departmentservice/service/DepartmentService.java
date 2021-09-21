package com.microservices.departmentservice.service;

import com.microservices.departmentservice.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public Department findDepartmentById(Long departmentId);
	
	
}
