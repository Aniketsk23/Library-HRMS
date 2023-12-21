package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.department.entity.DepartmentEntity;
import com.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
		// TODO Auto-generated method stub
		log.info("Inside saveDepartment of DepartmetnService");
		return departmentRepository.save(departmentEntity);
	}

	public DepartmentEntity findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		log.info("Inside saveDepartment of DepartmetnService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
}
