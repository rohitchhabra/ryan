package com.ryan.notification.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.notification.dao.StudentRepository;
import com.ryan.notification.dto.NotificationResponse;
import com.ryan.notification.dto.StudentDto;
import com.ryan.notification.entity.Student;
import com.ryan.notification.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	/*@Autowired
	BaseDao<Student> baseDao;*/
	
	@Autowired
	StudentRepository studentRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Transactional
	@Override
	public NotificationResponse addStudent(StudentDto studentDto) {
		NotificationResponse response = new NotificationResponse();
		
		Student student = modelMapper.map(studentDto, Student.class);
		studentRepository.save(student);
		response.setResponseCode("101");
		response.setResponseDesc("Success");
		return response;
	}

	@Override
	public NotificationResponse getStudents() { 
		NotificationResponse response = new NotificationResponse();
		List<Student> studentList =(List<Student>) studentRepository.findAll();
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		for(Student eachStudent : studentList){
			StudentDto dto = new StudentDto();
			studentDtoList.add(modelMapper.map(eachStudent,StudentDto.class ));
		}
		/*studentList.forEach(student->{
			StudentDto dto = new StudentDto();
			studentDtoList.add(modelMapper.map(student,StudentDto.class ));
		});*/
		response.setStudentDtoList(studentDtoList);
		response.setResponseCode("101");
		response.setResponseDesc("Success");
		return response;
	}

}
