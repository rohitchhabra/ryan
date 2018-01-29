package com.ryan.notification.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryan.notification.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	
}
