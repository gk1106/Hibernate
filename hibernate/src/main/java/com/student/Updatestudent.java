package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatestudent {

	public static void main(String[] args) 
	{
	
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("krishna");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       
       Student s =em.find(Student.class, 3);
       s.setName("neelavannan");
       s.setEmail("neela123@gmail.com");
       s.setPercentage(85.0);
       et.begin();
       em.merge(s);
       em.remove(s);
       et.commit();
	}

}
