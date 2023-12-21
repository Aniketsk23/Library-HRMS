package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService; 
	
	@PostMapping("/")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		log.info("Inside saveDepartment method of DepartmentController");
		return employeeService.saveEmployee(employeeEntity);
	
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity findemployeeById (@PathVariable("id") Long employeeId) {
		
		log.info("Inside findEmployeeById method of EmployeeController");
		return employeeService.findEmployeeById(employeeId);
	}
	
}
