package main.controller;


import com.car.engine.dao.MainDao;
import car.engine.dto.Car;
import car.engine.dto.Engine;

public class MainDriver
{
	public static void main(String[] args) 
	{
		
		
//		Car addcar = new Car();
//		addcar.setName("EECO");
//		addcar.setColor("GREY");
//		addcar.setPrice(650000);
//		addcar.setBrand("MARUTISUZUKI");
//		Engine addengine =new Engine();
//		
//		addengine.setCc(1150);
//		addengine.setFueltype("PETROL");
//		addengine.setNoofcylinders(3);
//		addengine.setCar(addcar);
//		addcar.setEngine(addengine);
		
	MainDao dao = new MainDao();
  //  Car firstcar =	dao.Savecar(addcar);
//	System.out.println(firstcar);
		
	Car oldcar = dao.findcar(3);
	oldcar.setColor("WHITE");
	oldcar.getEngine().setFueltype("DIESEL");
	Car update =dao.Updatecar(oldcar, oldcar.getId());
	System.out.println(update);
//	
//	
	 Car finded=dao.findcar(3);
		System.out.println(finded);
//
//	Car remove= dao.removecar(2);
//	System.out.println(remove);
	
	
	}
	
	

}
