package com.attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.attendance.entity.AttendanceEntity;
import com.attendance.repository.AttendanceRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AttendanceService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public AttendanceEntity saveAttendance(AttendanceEntity attendanceEntity) {
		// TODO Auto-generated method stub
		log.info("Inside saveAttendance of AttendanceService");
		return attendanceRepository.save(attendanceEntity);
	}

	public AttendanceEntity findAttendanceById(Long attendanceId) {
		// TODO Auto-generated method stub
		log.info("Inside saveAttendance of AttendanceService");
		return attendanceRepository.findByAttendanceId(attendanceId);
	
	}
	
}
