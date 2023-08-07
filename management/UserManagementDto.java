package com.example.forest.dto.management;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserManagementDto {

	private long id;
	private String nickname;
	private String email;
	private String role;
	private LocalDateTime createdTime;
	
}
