package com.spring.jpa.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.repository.BuddyRepository;
import com.spring.jpa.vo.Buddy;

@Service
public class BuddyService {

	@Autowired
	private BuddyRepository buddyRepository;
	public Buddy saveBuddy(Buddy buddy) {
		return buddyRepository.save(buddy);
	}
}
