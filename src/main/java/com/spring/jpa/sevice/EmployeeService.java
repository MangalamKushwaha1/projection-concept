package com.spring.jpa.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.dto.EmployeeDtoProjection;
import com.spring.jpa.repository.EmployeeRepository;
import com.spring.jpa.vo.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee  employee) {
		System.out.println(employee);
		return employeeRepository.save(employee);
	}
	
	public List<EmployeeDtoProjection> getEmployeeDtoProjectionsData(long id) {
		return employeeRepository.getEmployeeDtoProjections(id);
	}
}
