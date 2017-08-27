package com.hjbello.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository("imagesDAO")
public class ImagesDAOImpl implements ImagesDAO {
	final static Logger logger = LoggerFactory.getLogger(ImagesDAOImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public  void save(TImages tImages) {
		entityManager.persist(tImages);
		logger.info("Image saved");
	}



}
