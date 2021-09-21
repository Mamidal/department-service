package com.microservices.departmentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.departmentservice.entity.Department;

public interface DepartmentRepository extends MongoRepository<Department, Long>{

	public Department findByDepartmentId(Long departmentId);
	
}
