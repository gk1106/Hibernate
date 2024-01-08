package com.company.employee.manager.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.employee.manager.dto.Employee;
public class EmployeeDao 
{
	EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	EntityManager manager =boss.createEntityManager();
	EntityTransaction trans = manager.getTransaction();
	
	public Employee  InsertEmployee(Employee newEmployee )
	{
		trans.begin();
		manager.persist(newEmployee);
		trans.commit();
		return newEmployee;
	}
	
	public Employee updateEmployee(Employee updateemployee, int id)
	{
		Employee oldemployee =manager.find(Employee.class, id);
				if(oldemployee!=null)
				{
					if(updateemployee.getName()==null)
					{
						updateemployee.setName(oldemployee.getName());
					}
					if(updateemployee.getSalary()==0)
					{
						updateemployee.setSalary(oldemployee.getSalary());
					}
				    if(updateemployee.getManager()==null)
				    {
				    	updateemployee.setManager(oldemployee.getManager());
				    }
				    updateemployee.setId(id);
				    trans.begin();
				    manager.merge(updateemployee);
				    trans.commit();
				
		return updateemployee;
	}
				else
				{
					System.out.println(" please change the id... ");
					return null;
				}

	}
	public Employee FindEmployee(int id)
	{
		Employee find =manager.find(Employee.class, id);
		
		if(find!=null)
		{
			return find;
			
		}
		else
		{
			System.out.println(" please change the id...");
			return null;
		}
		
	}
	public Employee removeemEmployee(int id)
	{
		Employee remove =manager.find(Employee.class, id);
		if(remove!=null)
		{
		trans.begin();
		manager.remove(remove);
		trans.commit();
		return remove;
		}
		else
		{
			System.out.println(" please change the id...");
			return null;
		}
	}

}
