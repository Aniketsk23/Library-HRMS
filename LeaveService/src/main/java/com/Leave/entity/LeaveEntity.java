package com.Leave.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class LeaveEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long leaveId;
	private String Name;
	private String EmailId;
	private Date fromDate;
	private Date toDate;
	private String leaveType;
	private String reason;
	private int duration;
	
}
