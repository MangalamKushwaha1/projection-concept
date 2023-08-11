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
@Table(name = "buddy")
public class Buddy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buddy_id")
	private Long buddyId;

	@Column(name = "buddy_name")
	private String buddyName;
	@Column(name = "buddy_designation")
	private String buddyDesignation;
}
