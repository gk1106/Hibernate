package com.actor.movie.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.actor.movie.dto.Actor;
import com.actor.movie.dto.Movie;

public class MainDao 
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("krishna");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Actor Saveactor(Actor newactor)
	{
		et.begin();
		em.persist(newactor);
		et.commit();
		return newactor;
	}
	public Actor FindActor(int id)
	{
		Actor find = em.find(Actor.class, id);
		if(find!=null)
		{
			return find;
			
		}
		else
		{
			return null;
		}
	}
	public Actor UpdateActor(Actor updateactor,int id)
	{
		Actor oldactor = FindActor(id);
		if(oldactor!=null)
		{
			if(updateactor.getActor_name()==null)
			{
				updateactor.setActor_name(oldactor.getActor_name());
			}
			if(updateactor.getAge()==0)
			{
				updateactor.setAge(oldactor.getAge());
			}
			if(updateactor.getGender()==null)
			{
				updateactor.setGender(oldactor.getGender());
			}
			if(updateactor.getNoofmovies()==0)
			{
				updateactor.setNoofmovies(oldactor.getNoofmovies());
			}
			if(updateactor.getMovie()==null)
			{
				updateactor.setMovie(oldactor.getMovie());
			}
			updateactor.setActor_id(id);
			et.begin();
			em.merge(updateactor);
			et.commit();
			return updateactor;
		}
		else 
		{
			return null;
		}
	}
    public Actor Removeactor(int id)
    {
    	Actor remove = FindActor(id);
    	if(remove!=null)
    	{
    		et.begin();
    		em.remove(remove);
    		et.commit();
    		return remove;
    	}
    	else
    	{
    		return null;
    	}
    }
    
    public Movie Findmovie(int id)
	{
		Movie find = em.find(Movie.class, id);
		if(find!=null)
		{
			return find;
			
		}
		else
		{
			return null;
		}
	}
    
    public Movie Removemovie(int id)
    {
    	Movie remove = em.find(Movie.class,id);
    	if(remove!=null)
    	{
    		et.begin();
    		em.remove(remove);
    		et.commit();
    		return remove;
    	}
    	else
    	{
    		return null;
    	}
    }
    public Movie UpdateMovie(Movie updatemovie,int id)
	{
		Actor oldactor = FindActor(id);
		if(oldactor!=null)
		{
			updatemovie.setMovie_id(id);
			et.begin();
			em.merge(updatemovie);
			et.commit();
			return updatemovie;
			
		}
		else
		{
			return null;
		}

	}
}