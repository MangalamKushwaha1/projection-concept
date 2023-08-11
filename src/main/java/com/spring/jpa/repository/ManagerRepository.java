package com.spring.jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.vo.Employee;
import com.spring.jpa.vo.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
