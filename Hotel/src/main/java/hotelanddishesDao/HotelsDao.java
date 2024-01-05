package hotelanddishesDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hotelanddishesDto.Hotels;


public class HotelsDao 
{
	 EntityManagerFactory boss = Persistence.createEntityManagerFactory("krishna");
     EntityManager manager =boss.createEntityManager();
     EntityTransaction trans= manager.getTransaction();
     
     
     public Hotels Addhotel(Hotels addhotel)
     {
    	 trans.begin();
    	 manager.persist(addhotel);
    	 trans.commit();
    	 return addhotel;
    	 
     }
    
     public Hotels Updatehotel(Hotels updatehotel, int id)
     {
    	 Hotels oldhotel = manager.find(Hotels.class, id);
    	 if(oldhotel!=null)
    	 {
    		 if(oldhotel.getName()!=null)
    		 {
    			 oldhotel.setName(updatehotel.getName());
    		 }
    		 if(oldhotel.getContact()!=0)
    		 {
    			 oldhotel.setContact(updatehotel.getContact());
    		 }
    		 if(oldhotel.getRating()!=null)
    		 {
    			oldhotel.setRating(updatehotel.getRating()); 
    		 }
    		 if(oldhotel.getDishes()!=null)
    		 {
    			 oldhotel.setDishes(updatehotel.getDishes());
    		 }
    		 
    		 trans.begin();
    		 manager.merge(updatehotel);
    		 trans.commit();
    		 return oldhotel;
    		 
    	 }
    	 
    	 else
    	 {
    		 System.out.println();
    		 return null; 
    	 }
     }
     public Hotels Findhotel(int id)
     {
    	 Hotels findhotel= manager.find(Hotels.class, id);
    	 return findhotel;
    	 
     }
     
     public Hotels Removehotel(int id)
     {
    	 Hotels removehotel =manager.find(Hotels.class, id);
    	 
    	 if(removehotel!=null)
    	 {
    		 trans.begin();
    		 manager.remove(removehotel);
    		 trans.commit();
    		 return removehotel;
    		 
    	 }
    	 else
    	 {
    		 System.out.println("");
    		 return null;
    	 }

 }
}