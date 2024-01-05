package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveStudent 
{
	public static void main(String[] args) 
	{
	
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("krishna");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       
       Student s =em.find(Student.class, 3);
       et.begin();
       em.remove(s);
       et.commit();
	}


}
