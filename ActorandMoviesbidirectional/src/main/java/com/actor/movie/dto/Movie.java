package com.actor.movie.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movie_id;
	private String  movie_name;
	private String language;
	private double boxofficeco;
	private double rating;
	@ManyToOne
	private Actor actor;
	
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getBoxofficeco() {
		return boxofficeco;
	}
	public void setBoxofficeco(double boxofficeco) {
		this.boxofficeco = boxofficeco;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", language=" + language
				+ ", boxofficeco=" + boxofficeco + ", rating=" + rating + "]";
	}
	
	
	
	

}
