package com.hibernate.emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.emp.dto.Employee;

public class EmployeeDao 
{
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("krishna");
	EntityManager em =emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public Employee  SaveEmp(Employee emp) 
	{
	
		et.begin();
		em.persist(emp);
		et.commit();
		return emp;
	}
	public Employee  updateEmp(Employee emp , int id) 
{
	  Employee e1=em.find(Employee.class, id);
	  if(e1!=null)
	  {  
		emp.setId(id);
		  et.begin();
		em.merge(emp);
		et.commit();
		return e1;
	  }
	  else
	  {
		  System.out.println("please type only inserted id only....");
		  return null;
	  }
	}
	public Employee  FindEmp(int id ) 
	{
		Employee e2= em.find(Employee.class, id);
	
		return e2;
	}
	public Employee  Remove(int id) 
	{
		Employee e3 =em.find(Employee.class, id);
		if(e3!=null) 
		{
		   et.begin();
		   em.remove(e3);
		   et.commit();
		   return e3;
		}
		else 
		{
			System.out.println("id is not avaliable.....");
			return null;
		}
	}
}
