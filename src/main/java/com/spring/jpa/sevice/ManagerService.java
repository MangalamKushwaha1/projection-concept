package com.spring.jpa.sevice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.repository.ManagerRepository;
import com.spring.jpa.vo.Manager;


@Service
public class ManagerService {

	
	@Autowired
	private ManagerRepository managerRepository;
	
	
	public Manager saveManager(Manager manager) {
		return managerRepository.save(manager);
	}
}
