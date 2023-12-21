package com.book.entity;

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
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	private String bookType;
	private Date bookObtained;
	private Date issueDate;
	private Date returnDate;
	private String bookPublisher;
	
}
