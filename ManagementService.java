package com.example.forest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forest.repository.ManagementRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ManagementService {
	// 순환 참조 문제가 생김.
	/*
	 * private final ManagementRepository managementRepository;
	 * 
	 * @Autowired public ManagementService(ManagementService managementRepository) {
	 * this.managementRepository = managementRepository; }
	 * 
	 * public List<User> findByNickname(String nickname) { return
	 * managementRepository.findByNickname(nickname); }
	 * 
	 * public List<User> findByEmail(String Email) { return
	 * managementRepository.findByEmail(Email); }
	 */
}
