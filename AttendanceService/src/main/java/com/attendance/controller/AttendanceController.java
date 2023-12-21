package com.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.entity.AttendanceEntity;
import com.attendance.service.AttendanceService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/attendance")
@Slf4j
public class AttendanceController {


	@Autowired
	private AttendanceService attendanceService; 
	
	@PostMapping("/")
	public AttendanceEntity saveAttendance(@RequestBody AttendanceEntity attendanceEntity) {
		log.info("Inside saveAttendance method of AttendanceController");
		return attendanceService.saveAttendance(attendanceEntity);
	
	}
	
	@GetMapping("/{id}")
	public AttendanceEntity findattendanceById (@PathVariable("id") Long attendanceId) {
		
		log.info("Inside findAttendanceById method of AttendanceController");
		return attendanceService.findAttendanceById(attendanceId);
	
	}
	
}
