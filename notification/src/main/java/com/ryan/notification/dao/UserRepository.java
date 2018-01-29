package com.ryan.notification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ryan.notification.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findUserByEmailAndPassword(String email,String password);
}
