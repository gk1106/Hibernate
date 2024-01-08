package com.actor.movie.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Actor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actor_id;
	private String actor_name;
	private int age;
	private int noofmovies;
	private String gender;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Movie> movie;
	
	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoofmovies() {
		return noofmovies;
	}

	public void setNoofmovies(int noofmovies) {
		this.noofmovies = noofmovies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", actor_name=" + actor_name + ", age=" + age + ", noofmovies="
				+ noofmovies + ", gender=" + gender + ", movie=" + movie + "]";
	}
	

}
