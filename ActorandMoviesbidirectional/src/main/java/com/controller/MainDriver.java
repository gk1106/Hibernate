package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.actor.movie.dao.MainDao;
import com.actor.movie.dto.Actor;
import com.actor.movie.dto.Movie;

public class MainDriver {

	public static void main(String[] args)
	{
		MainDao dao = new MainDao();
//		Movie m1 = new Movie();
//		m1.setMovie_name("LEO");
//		m1.setLanguage("tamil");
//		m1.setBoxofficeco(10000000.0);
//		m1.setRating(9);
//		
//		Movie m2= new Movie();
//		m2.setMovie_name("SARKAR");
//		m2.setLanguage("tamil");
//		m2.setBoxofficeco(10000000.0);
//		m2.setRating(8);
//		
//		Movie m3 = new  Movie();
//		m3.setMovie_name("MASTER");
//		m3.setLanguage("tamil");
//		m3.setBoxofficeco(1000000.0);
//		m3.setRating(8.5);
//		
//		Actor a1 =new Actor();
//		a1.setActor_name("VIJAY");
//		a1.setAge(49);
//		a1.setGender("male");
//		a1.setNoofmovies(67);
//		m1.setActor(a1);
//		m2.setActor(a1);
//		m3.setActor(a1);
//		
//		List<Movie> movies = new ArrayList<Movie>();	
//		
//		movies.add(m1);
//		movies.add(m2);
//		movies.add(m3);
//		
//		a1.setMovie(movies);
//		
//		
//		System.out.println(dao.Saveactor(a1));
//		
//		Movie m4 = new Movie();
//		m4.setMovie_name("pathaan");
//		m4.setLanguage("hindi");
//		m4.setBoxofficeco(10000700.0);
//		m4.setRating(8);
//		
//		Movie m5= new Movie();
//		m5.setMovie_name("chennai express");
//		m5.setLanguage("hindi");
//		m5.setBoxofficeco(100008000.0);
//		m5.setRating(7.6);
//		
//		Movie m6 = new  Movie();
//		m6.setMovie_name("jawan");
//		m6.setLanguage("hindi");
//		m6.setBoxofficeco(10600000.0);
//		m6.setRating(7.5);
//		
//		Actor a2 =new Actor();
//		a2.setActor_name("SRK");
//		a2.setAge(57);
//		a2.setGender("male");
//		a2.setNoofmovies(80);
//		m4.setActor(a2);
//		m5.setActor(a2);
//		m6.setActor(a2);
//		
//		List<Movie> movie = new ArrayList<Movie>();	
//		
//		movie.add(m4);
//		movie.add(m5);
//		movie.add(m6);
//		
//		a2.setMovie(movie);
//		System.out.println(dao.Saveactor(a2));
//		
//		
//	Actor findactor= dao.FindActor(2);
//	List <Movie>findmovies  =	findactor.getMovie();
//		
//	for(Movie m : findmovies )
//	{
//		if( m.getMovie_name().equals("jawan"))
//		{
//			m.setRating(8.5);
//		}
//	}
//	
//	findactor.setMovie(findmovies);
//	System.out.println( dao.UpdateActor(findactor, 2));
	
		
//		same  Actor id and add new movie 
		
//		Actor oldactor= dao.FindActor(1);
//		Movie m7 =new Movie();
//		m7.setMovie_name("bigil");
//		m7.setLanguage("tamil");
//		m7.setBoxofficeco(1303020900.9);
//		m7.setRating(7);
//		List <Movie> newmovie = oldactor.getMovie();
//		newmovie.add(m7);
//		m7.setActor(oldactor);
//		oldactor.setMovie(newmovie);
//		dao.UpdateActor(oldactor, 1);
//		
//		
//		
//		//  find movie id and update actor details 
//		
//		Movie oldmovie =dao.Findmovie(1);
//		Actor updateactor = oldmovie.getActor();
//		updateactor.setAge(50);
//		updateactor.setActor_name("Thalapathy Vijay");
//		Actor updated= dao.UpdateActor(updateactor, 1);
//		
//		System.out.println(updated);
//		
		
		// find actor id delete movie details
		
//		 Actor finded =dao.FindActor(1);
//		 List <Movie>findmovie = finded.getMovie();
//		 
//		 for(Movie md : findmovie) 
//		 {
//			 if(md.getMovie_name().equals("SARKAR"))
//			 {
//				 md.setActor(null);
//				 findmovie.remove(md);
//				 dao.UpdateMovie(md, md.getMovie_id());
//				 dao.Removemovie(md.getMovie_id());
//				 finded.setMovie(findmovie);
//				 dao.UpdateActor(finded, finded.getActor_id());
//				
//			 }
//		 }
//		 
	dao.FindActor(2);
	}

		 }
		 
		 
