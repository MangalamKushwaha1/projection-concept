package com.spring.jpa.repository;

import org.apache.catalina.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.vo.Buddy;

@Repository
public interface BuddyRepository extends JpaRepository<Buddy, Long>{

}
