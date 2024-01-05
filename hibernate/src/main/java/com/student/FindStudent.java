package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {

	public static void main(String[] args) 
	{
		EntityManagerFactory managerfactory =Persistence.createEntityManagerFactory("krishna");
		EntityManager manager =managerfactory.createEntityManager();
		Student s= manager.find(Student.class, 3);
		System.out.println(s );
	}

}
