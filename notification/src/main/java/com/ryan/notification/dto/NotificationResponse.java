package com.ryan.notification.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ryan.notification.entity.Student;

@JsonInclude(value=Include.NON_NULL)
public class NotificationResponse {

	private String responseCode;
	private String responseDesc;
	
	private UserDto userDto;	
	private List<StudentDto> studentDtoList;

	

	public List<StudentDto> getStudentDtoList() {
		return studentDtoList;
	}

	public void setStudentDtoList(List<StudentDto> studentDtoList) {
		this.studentDtoList = studentDtoList;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	
}
