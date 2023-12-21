package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.department.entity.DepartmentEntity;
import com.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService; 
	
	@PostMapping("/")
	public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(departmentEntity);
	
	}
	
	@GetMapping("/{id}")
	public DepartmentEntity findDepartmentById (@PathVariable("id") Long departmentId) {
		
		log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
}
