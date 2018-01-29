package com.service.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {

	private static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		
		if( entityManager == null){
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "persistenceUnit" );
			setEntityManager(entityManagerFactory.createEntityManager());
		}
		
		return entityManager;
	}

	private static void setEntityManager(EntityManager entityManager) {
		EntityManagerUtils.entityManager = entityManager;
	}


	public static boolean isAttive(){
		
		if( entityManager == null){
			
			entityManager = getEntityManager();
			
			return entityManager.getTransaction().isActive();
			
		}else{
			return entityManager.getTransaction().isActive();
		}
		
	}
	
	public static boolean activeTransaction(){
		
		if( !isAttive()){
			
			entityManager = getEntityManager();
			
			entityManager.getTransaction().begin();
			
			return entityManager.getTransaction().isActive();
			
		}else{
			return entityManager.getTransaction().isActive();
		}
		
	}
	
	public static void transactionCommit(){
		
		if( isAttive())
			entityManager.getTransaction().commit();		
	}
	
	public static void rollbackTransaction(){
		if( isAttive())
			entityManager.getTransaction().rollback();	
	}
}
