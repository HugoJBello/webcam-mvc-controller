package com.hjbello.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Repository("recordActivityDAO")
public class RecordActivityDAOImpl implements RecordActivityDAO {
	final static Logger logger = LoggerFactory.getLogger(RecordActivityDAOImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;	
	
	@Transactional
	public  void save(TAppActivityLog tAppActivityLog) {
		entityManager.persist(tAppActivityLog);
		logger.info("Activity saved.");
		
	}


}
