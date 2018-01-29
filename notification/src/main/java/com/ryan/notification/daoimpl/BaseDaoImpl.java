package com.ryan.notification.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.notification.dao.BaseDao;

@Repository
public class BaseDaoImpl<BaseDomain>  {

	/*@PersistenceContext
	EntityManager manager;*/
	
	//@Autowired
	//private SessionFactory sessionFactory;
	
	private Class<BaseDomain> type;
	
	/* public BaseDaoImpl() {
	        Type t = getClass().getGenericSuperclass();
	        ParameterizedType pt = (ParameterizedType) t;
	        type = (Class) pt.getActualTypeArguments()[0];
	    }*/
	 
	/*@Override
	@Transactional
	public BaseDomain save(BaseDomain doamin) {
		sessionFactory.openSession().saveOrUpdate(doamin);
		//manager.persist(doamin);
		return doamin;
	}*/

		

}
