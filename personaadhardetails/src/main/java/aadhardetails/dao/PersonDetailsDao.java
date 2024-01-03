package aadhardetails.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import aadhardetails.dto.Persondetails;

public class PersonDetailsDao
{
	EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	EntityManager manager = boss.createEntityManager();
	EntityTransaction trans =manager.getTransaction();    
	
	
	
	public Persondetails SavePersonDetails(Persondetails newperson)
	{
		      trans.begin();
		      manager.persist(newperson);
		      trans.commit();
		      return newperson;
	}
	
	public Persondetails updatePersonDetails(Persondetails updateperson,int id)
	
	{
		Persondetails oldperson = manager.find(Persondetails.class , id);
		
		if(oldperson!=null) 
		{
			updateperson.setId(id);
			if(oldperson.getName()!=null)
			{
				oldperson.setName(updateperson.getName());
			}
			if(oldperson.getEmail()!=null)
			{
				oldperson.setEmail(updateperson.getEmail());
			}
			if(oldperson.getPhno()!=0)
			{
				oldperson.setPhno(updateperson.getPhno());
			}
			if(oldperson.getAadhar()!=null) 
			{
				oldperson.setAadhar(updateperson.getAadhar());
				
			}
			trans.begin();
			manager.merge(updateperson);
			trans.commit();
			return oldperson;
		}
		else
		{
			System.out.println("");
			return null;
		}
	}
	
	public Persondetails FindPersonDetails(int id) 
	{
		Persondetails find=manager.find(Persondetails.class,id);
		
		if(find!=null)
		{	
		    return find;
		}
		else 
		{
			System.out.println("");
			return null;
		}
	}
	
	public Persondetails RemovePersonDetails(int id)
	{
		Persondetails remove =manager.find(Persondetails.class, id);
		
		if(remove!=null) 
		{
			trans.begin();
			manager.remove(remove);
			trans.commit();
			return remove;
		}
		else
		{
			System.out.println("");
			return null;
		}
	}

}
