package com.ryan.notification.daoimpl;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ryan.notification.dao.UserRepository;
import com.ryan.notification.entity.User;

@Repository
public class UserRepositoryImpl {//implements UserRepository{

	//@Autowired
	//private SessionFactory sessionFactory;
	
	/*public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/
	
	/*@Override
	public User findUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.openSession();
			Query query=session.createQuery("From User u where u.email=:email and u.password=:password");
			query.setParameter("email", email);
			query.setParameter("password", password);
			return (User) query.uniqueResult();
		}catch(Exception e){
			System.out.println(" "+ExceptionUtils.getStackTrace(e));
		}
		return null;
	}*/

}
