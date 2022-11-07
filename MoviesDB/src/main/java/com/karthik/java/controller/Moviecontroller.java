package com.karthik.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.java.model.Movie;
import com.karthik.java.service.MovieService;

@RestController
public class Moviecontroller {
	
	@Autowired
	MovieService movieService;

	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/movies")
	public List<Movie> getMovies() {
		
		return movieService.getMovies();
	}
}
