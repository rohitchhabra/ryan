package com.ryan.notification.services;

import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.StudentDto;

public interface StudentService {

	NotificationResponse addStudent(StudentDto studentDto);
	NotificationResponse getStudents();
}
