package aadhardetails.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import aadhardetails.dto.Aadhardetails;

public class AadharDetailsDao 
{
	EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	EntityManager manager = boss.createEntityManager();
	EntityTransaction trans =manager.getTransaction();
	
	public Aadhardetails SaveAadharDetails(Aadhardetails newaadhar)
	{
		trans.begin();
		manager.persist(newaadhar);
		trans.commit();
		return newaadhar;
		
	}
	
	public Aadhardetails UpdateAadharDetails(Aadhardetails updateaadhar,int id)
	{
		Aadhardetails olddetails = manager.find(Aadhardetails.class, id);
		
		if(olddetails!=null)
		{
			updateaadhar.setId(id);
			
			if(updateaadhar.getNumber() ==0)
			{
				updateaadhar.setNumber(olddetails.getNumber());
			}
			if(updateaadhar.getAddress()==null)
			{
				updateaadhar.setAddress(olddetails.getAddress());
			}
			
			if(updateaadhar.getDob()==null)
			{
				updateaadhar.setDob(olddetails.getDob());
			}
			if(updateaadhar.getGender()=='\0')
			{
				updateaadhar.setGender(olddetails.getGender());
			}
			trans.begin();
			manager.merge(updateaadhar);
			trans.commit();
			return olddetails;
			
		}
		
		else 
		{
			System.out.println("");
			return null;
		}
		
	}
	
	public Aadhardetails FindAadharDetails(int id) 
	{
		Aadhardetails find=manager.find(Aadhardetails.class,id);
		
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
	
	public Aadhardetails RemoveAadhardetails(int id)
	{
		Aadhardetails remove =manager.find(Aadhardetails.class, id);
		
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
