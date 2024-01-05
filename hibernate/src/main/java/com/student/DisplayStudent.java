package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayStudent {

	public static void main(String[] args) 
	{
		EntityManagerFactory managerfactory =Persistence.createEntityManagerFactory("krishna");
		EntityManager manager =managerfactory.createEntityManager();
		
		for(int i=1;i<5;i++)
		{	
		Student s= manager.find(Student.class,i );
		System.out.println(""+     s.getId()  +" "+    s.getName()  +" "+     s.getEmail() +" "+   s.getPercentage() );
		}
	}

}
