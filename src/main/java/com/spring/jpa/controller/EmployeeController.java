package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.dto.EmployeeDtoProjection;
import com.spring.jpa.sevice.EmployeeService;
import com.spring.jpa.vo.Employee;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get/{id}")
	public List<EmployeeDtoProjection> getEmployeeDtoById(@PathVariable Long id) {
		return employeeService.getEmployeeDtoProjectionsData(id);
	}

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employeeService.saveEmployee(employee);
	}
}
