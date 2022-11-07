package com.karthik.java.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movie")
public class Movie {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<String> getActor() {
		return actor;
	}
	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	
	public Movie(int id, String name, String desc, String director, String language, List<String> actor) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.director = director;
		this.language = language;
		this.actor = actor;
	}
	
	@Id
	private int id;
	private String name;
	private String desc;
	private String director;
	private String language;
	private List<String> actor;
	

}
