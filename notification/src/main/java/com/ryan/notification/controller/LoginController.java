package com.ryan.notification.controller;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.UserDto;
import com.ryan.notification.services.LoginService;


@Controller
public class LoginController {

@Autowired
private LoginService loginService;

@RequestMapping(value="/login", method=RequestMethod.POST,consumes="application/json",produces="application/json")
public @ResponseBody NotificationResponse login(@RequestBody UserDto userDto){
	NotificationResponse response ;
	try{
		response = loginService.login(userDto);
	}catch(Exception e){
		response = new NotificationResponse();
		response.setResponseCode("501");
		response.setResponseDesc("Exception occured "+e.getMessage());
		System.out.println(ExceptionUtils.getStackTrace(e));
	}
	return response;
}

}
