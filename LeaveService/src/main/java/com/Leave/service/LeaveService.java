package com.Leave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leave.entity.LeaveEntity;
import com.Leave.repository.LeaveRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LeaveService {


	@Autowired
	private LeaveRepository leaveRepository;

	public LeaveEntity saveLeave(LeaveEntity leaveEntity) {
		// TODO Auto-generated method stub
		log.info("Inside saveLeave of LeaveService");
		return leaveRepository.save(leaveEntity);
	}

	public LeaveEntity findLeaveById(Long leaveId) {
		// TODO Auto-generated method stub
		log.info("Inside saveLeave of LeaveService");
		return leaveRepository.findByLeaveId(leaveId);
	
	}
	
}
