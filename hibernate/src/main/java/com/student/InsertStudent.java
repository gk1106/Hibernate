package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("krishna");
		s1.setEmail("krishna@gmail.com");
		s1.setPercentage(90.7);
		et.begin();
		em.persist(s1);
		et.commit();
	
		
		
		

	}

}
