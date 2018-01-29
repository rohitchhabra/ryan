package com.ryan.notification.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ryan.notification.entity.Student;

@JsonInclude(value=Include.NON_NULL)
public class CollegeDto {

	private int id;
	private Student student;
	private String name;
	private String country;
}
