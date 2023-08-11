package com.spring.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.jpa.dto.EmployeeDtoProjection;
import com.spring.jpa.vo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT e.employee_name AS employeeName , e.employee_designation\r\n"
			+ "AS employeeDesignation, b.buddy_name AS buddyName, \r\n" + "b.buddy_designation AS buddyDesignation,\r\n"
			+ "m.manager_name AS managerName\r\n" + "FROM employee e \r\n" + "JOIN buddy b ON e.buddy_id=b.buddy_id\r\n"
			+ "JOIN manager m ON e.manger_id=m.manager_id\r\n" + "WHERE e.employee_id=:employeeId", nativeQuery = true)
	List<EmployeeDtoProjection> getEmployeeDtoProjections(@Param("employeeId") Long employeeId);
}
