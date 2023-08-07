package com.example.forest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.forest.model.User;

public interface ManagementRepository extends JpaRepository<User, Long> {
	
	// Nickname으로 검색하기:
	List<User> findByNickname(String nickname);
	
	// Email로 검색
	List<User> findByEmail(String Email);

}
