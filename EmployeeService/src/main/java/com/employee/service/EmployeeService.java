package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class EmployeeService {



	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		log.info("Inside saveEmployee of EmployeeService");
		return employeeRepository.save(employeeEntity);
	}

	public EmployeeEntity findEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		log.info("Inside saveEmployee of EmployeeService");
		return employeeRepository.findByEmployeeId(employeeId);
	
	}
}
