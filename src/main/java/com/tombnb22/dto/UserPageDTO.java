package com.tombnb22.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<UserDTO> users;
}





