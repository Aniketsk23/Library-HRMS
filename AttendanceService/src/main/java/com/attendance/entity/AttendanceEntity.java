package com.attendance.entity;

import java.util.Date; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class AttendanceEntity {

	@Id
	@GeneratedValue
	private Long attendanceId;
	private Long employeeId;
	private String name;
	private Date presentDate;
	private String status;
	
}
