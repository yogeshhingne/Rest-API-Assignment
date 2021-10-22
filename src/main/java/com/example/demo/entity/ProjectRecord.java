package com.example.demo.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProjectRecord {
	@Id
	private Integer proId;
	private String proName;
	private String proStartDate;
	private String proEndDate;
	private String empList;
}
