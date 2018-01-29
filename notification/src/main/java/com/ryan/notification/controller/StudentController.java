package com.ryan.notification.controller;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.StudentDto;
import com.ryan.notification.services.StudentService;

@RequestMapping("/student")
@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody NotificationResponse addStudent(@RequestBody StudentDto studentDto){
		NotificationResponse response =new NotificationResponse();
		try{
			response = studentService.addStudent(studentDto);
		}catch(Exception e){
			response = new NotificationResponse();
			response.setResponseCode("501");
			response.setResponseDesc("Exception occured "+e.getMessage());
			System.out.println(ExceptionUtils.getStackTrace(e));
		}
		return response;
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody NotificationResponse getAllStudent(){
		NotificationResponse response =new NotificationResponse();
		try{
			response = studentService.getStudents();
		}catch(Exception e){
			response = new NotificationResponse();
			response.setResponseCode("501");
			response.setResponseDesc("Exception occured "+e.getMessage());
			System.out.println(ExceptionUtils.getStackTrace(e));
		}
		return response;
	}
}
