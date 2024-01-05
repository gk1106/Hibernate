package controller;

import java.util.ArrayList;
import java.util.List;

import hotelanddishesDao.DishesDao;
import hotelanddishesDao.HotelsDao;
import hotelanddishesDto.Dishes;
import hotelanddishesDto.Hotels;

public class MainHotel {

	public static void main(String[] args) 
	{
		
		Dishes firstdish = new  Dishes() ;
		
		firstdish.setName("Dosa");
		firstdish.setType("veg");
		firstdish.setDescripition("Onion Dosa");
		firstdish.setPrice(40);
		
		Dishes seconddish = new Dishes();
		
		seconddish.setName("Poori");
		seconddish.setType("veg");
		seconddish.setDescripition("normal");
		seconddish.setPrice(30);
		
		Dishes thirddish = new Dishes();
		
		thirddish.setName("Pongal");
		thirddish.setType("veg");
		thirddish.setDescripition("pongal and vada and sambar");
		thirddish.setPrice(40);
		
		Hotels firsthotel = new Hotels();
		
		firsthotel.setName("Adyar Anandha bhavan");
		firsthotel.setContact(8954334435l);
		firsthotel.setRating("four Star");
		
		List<Dishes> alldishes = new ArrayList<Dishes>();
		alldishes.add(firstdish);
		alldishes.add(seconddish);
		alldishes.add(thirddish);
		
		firsthotel.setDishes(alldishes);
		
		HotelsDao hoteldao = new HotelsDao();
		
		Hotels savehotel = hoteldao.Addhotel(firsthotel);
		
		System.out.println(savehotel);
		
		// update Dishes
		
		
		Dishes updatedish = new  Dishes();
		updatedish.setDescripition("Egg Noodles");
		updatedish.setName("Noodles");
		updatedish.setType("Non-Veg");
		updatedish.setPrice(100);
		
	   DishesDao updateDao = new DishesDao();
	   
	   Dishes updated =updateDao.UpdateDish(updatedish, 2);
	   System.out.println(updated);
	   
	   

	}

}
