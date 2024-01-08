package com.company.employee.manager.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.employee.manager.dto.Manager;

public class ManagerDao 
{
	EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	EntityManager manager =boss.createEntityManager();
	EntityTransaction trans = manager.getTransaction();
	
	
	
	
	public Manager  InsertManger(Manager newmanager )
	{
		trans.begin();
		manager.persist(newmanager);
		trans.commit();
		return newmanager;
	}
	
	public Manager UpdateManager(Manager updatemanager, int id)
	{
		Manager oldmanager =manager.find(Manager.class, id);
				if(oldmanager!=null)
				{
					if(updatemanager.getName()==null)
					{
						updatemanager.setName(oldmanager.getName());
					}
					if(updatemanager.getSalary()==0)
					{
						updatemanager.setSalary(oldmanager.getSalary());
					}
				    if(updatemanager.getEmail()==null)
				    {
				    	updatemanager.setEmail(oldmanager.getEmail());
				    }
				    updatemanager.setId(id);
				    trans.begin();
				    manager.merge(updatemanager);
				    trans.commit();
				
		return updatemanager;
	}
				else
				{
					System.out.println("please change the id...  ");
					return null;
				}

	}
	public Manager FindManager(int id)
	{
		Manager find =manager.find(Manager.class, id);
		
		if(find!=null)
		{
			return find;
			
		}
		else
		{
			System.out.println("no manager in this id please change the id...");
			return null;
		}
		
	}
	public Manager removemanager(int id)
	{
		Manager remove =manager.find(Manager.class, id);
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
