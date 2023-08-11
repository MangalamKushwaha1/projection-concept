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
@Table(name = "manager")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manager_id")
	private Long managerId;

	@Column(name = "manager_name")
	private String managerName;
	@Column(name = "manager_designation")
	private String managerDesignation;
}
