package com.Leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Leave.entity.LeaveEntity;




@Repository
public interface LeaveRepository extends JpaRepository <LeaveEntity, Long> {
	

	LeaveEntity findByLeaveId(Long leaveId);
} 