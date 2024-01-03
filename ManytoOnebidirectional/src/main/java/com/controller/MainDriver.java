package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.actor.movie.dao.MainDao;
import com.actor.movie.dto.Actor;
import com.actor.movie.dto.Movie;

public class MainDriver {

	public static void main(String[] args) 
	{
		MainDao dao =new MainDao();
		Movie m1 = new Movie();
		m1.setMovie_name("jailer");
		m1.setLanguage("tamil");
		m1.setBoxofficeco(10000000.0);
		m1.setRating(9);
		
		Movie m2= new Movie();
		m2.setMovie_name("Annatha");
		m2.setLanguage("tamil");
		m2.setBoxofficeco(10000000.0);
		m2.setRating(8);
		
		Movie m3 = new  Movie();
		m3.setMovie_name("sivaji");
		m3.setLanguage("tamil");
		m3.setBoxofficeco(1000000.0);
		m3.setRating(8.5);
		Actor a1 =new Actor();
		a1.setActor_name("rajini");
		a1.setAge(76);
		a1.setGender("male");
		a1.setNoofmovies(196);
		m1.setActor(a1);
		m2.setActor(a1);
		m3.setActor(a1);
		
		
		List<Movie> movies = new ArrayList<Movie>();	
		
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		
		a1.setMovie(movies);
		
		
		System.out.println(dao.Saveactor(m1));
		System.out.println(dao.Saveactor(m2));
		System.out.println(dao.Saveactor(m3));
	
		
	}

}
