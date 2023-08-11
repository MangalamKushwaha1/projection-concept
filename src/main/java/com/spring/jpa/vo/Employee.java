package com.spring.jpa.vo;

import jakarta.persistence.Column;
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
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;

	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "employee_designation")
	private String employeeDesignation;
	@Column(name = "employee_address")
	private String employeeAddress;

	// you have to map or add manager id and buddy id in employee table through which employee table can mapped with other 
	// table and you are able to fetch data from other tables too
	@Column(name = "buddy_id", columnDefinition = "bigint default 0")
	private long buddyId;

	@Column(name = "manger_id", columnDefinition = "bigint default 0")
	private long mangerId;
}
