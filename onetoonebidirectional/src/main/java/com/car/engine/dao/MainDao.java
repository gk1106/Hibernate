package com.car.engine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import car.engine.dto.Car;
import car.engine.dto.Engine;

public class MainDao 
{
	
	EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	EntityManager manager = boss.createEntityManager();
	EntityTransaction trans = manager.getTransaction();
	
	
	public Car Savecar(Car newcar)
	{
		trans.begin();
		manager.persist(newcar);
		trans.commit();
		return newcar;
	}
	public Car Updatecar(Car updatecar, int id)
	{
		Car oldcar = manager.find(Car.class, id);
		if(oldcar!=null)
		{
//			if(updatecar.getBrand()==null)
//			{
//				updatecar.setBrand(oldcar.getBrand());
//			}
//			if(updatecar.getName()==null)
//			{
//				updatecar.setName(oldcar.getName());
//			}
//			if(updatecar.getColor()==null)
//			{
//				updatecar.setColor(oldcar.getColor());
//				
//			}
//			if(updatecar.getEngine()==null)
//			{
//				updatecar.setEngine(oldcar.getEngine());
//			}
//			if(updatecar.getPrice()==0)
//			{
//				updatecar.setPrice(oldcar.getPrice());
//			}
				
			updatecar.setId(id);
			trans.begin();
			manager.merge(updatecar);
			trans.commit();
			return updatecar;
		}
		else
			{
				
			   return null;
				
			}
	}
	
	public	 Car findcar (int id)
		{
			Car findout= manager.find(Car.class, id);
			if(findout!=null)
			{
				return findout; 
			}
			else 
			{
				return null;
				
			}
		}
			
	public Car removecar(int id)
	{
		Car  removedcar = manager.find(Car.class,id);
		if(removedcar!=null)
		{
			
			trans.begin();
			manager.remove(removedcar);
			trans.commit();
			return removedcar;
			
		}
		else
		{
			return null;
		}
		
	}
	
	public Engine Saveengine(Engine newengine)
	{
		trans.begin();
		manager.persist(newengine);
		trans.commit();
		return newengine;
	}
	public Engine Updateengine(Engine updateengine, int id)
	{
		Engine oldengine = manager.find(Engine.class, id);
		if(oldengine!=null)
		{
			updateengine.setId(id);
			trans.begin();
			manager.merge(updateengine);
			trans.commit();
			return updateengine;
		}
		else
			{
				
			   return null;
				
			}
	}
	
	public	 Engine findengine (int id)
		{
			Engine findout= manager.find(Engine.class, id);
			if(findout!=null)
			{
				return findout; 
			}
			else 
			{
				return null;
				
			}
		}
			
	public Engine removeengine(int id)
	{
		Engine  removedengine = manager.find(Engine.class,id);
		if(removedengine!=null)
		{
			trans.begin();
			manager.remove(removedengine);
			trans.commit();
			return removedengine;
			
		}
		else
		{
			return null;
		}
		
	}
				
		}
		



