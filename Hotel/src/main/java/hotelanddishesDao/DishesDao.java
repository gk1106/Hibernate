package hotelanddishesDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hotelanddishesDto.Dishes;

public class DishesDao 
{
	     EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
	     EntityManager manager =boss.createEntityManager();
	     EntityTransaction trans= manager.getTransaction();
	     
	     
	     public Dishes AddDish(Dishes adddishes)
	     {
	    	 trans.begin();
	    	 manager.persist(adddishes);
	    	 trans.commit();
	    	 return adddishes;
	    	 
	     }
	    
	     public Dishes UpdateDish(Dishes updateDish, int id)
	     {
	    	 Dishes olddish = manager.find(Dishes.class, id);
	    	 if(olddish!=null)
	    	 {
	    		 if(updateDish.getName()==null)
	    		 {
	    			 updateDish.setName(olddish.getName());
	    		 }
	    		 if(olddish.getType()!=null)
	    		 {
	    			 olddish.setType(updateDish.getType());
	    		 }
	    		 if(olddish.getDescripition()!=null)
	    		 {
	    			olddish.setDescripition(updateDish.getDescripition()); 
	    		 }
	    		 if(olddish.getPrice()!=0)
	    		 {
	    			 olddish.setPrice(updateDish.getPrice());
	    		 }
	    		 
	    		 trans.begin();
	    		 manager.merge(updateDish);
	    		 trans.commit();
	    		 return olddish;
	    		 
	    	 }
	    	 
	    	 else
	    	 {
	    		 System.out.println();
	    		 return null; 
	    	 }
	     }
	     public Dishes FindDish(int id)
	     {
	    	 Dishes finddish= manager.find(Dishes.class, id);
	    	 return finddish;
	    	 
	     }
	     
	     public Dishes RemoveDish(int id)
	     {
	    	 Dishes removedish =manager.find(Dishes.class, id);
	    	 
	    	 if(removedish!=null)
	    	 {
	    		 trans.begin();
	    		 manager.remove(removedish);
	    		 trans.commit();
	    		 return removedish;
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("");
	    		 return null;
	    	 }
	    	 
	     
	     }
	
	
	

}
