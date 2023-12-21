package com.Leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leave.entity.LeaveEntity;
import com.Leave.service.LeaveService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/leaves")
@Slf4j
public class LeaveController {



	@Autowired
	private LeaveService leaveService; 
	
	@PostMapping("/")
	public LeaveEntity saveLeave(@RequestBody LeaveEntity leaveEntity) {
		log.info("Inside saveLeave method of LeaveController");
		return leaveService.saveLeave(leaveEntity);
	
	}
	
	@GetMapping("/{id}")
	public LeaveEntity findleaveById (@PathVariable("id") Long leaveId) {
		
		log.info("Inside findLeaveById method of LeaveController");
		return leaveService.findLeaveById(leaveId);
	
	}
}
