 package com.karthik.java.service;

import java.util.List;

import com.karthik.java.model.Movie;

public interface MovieService {

	public List<Movie> getMovies();
	public List<Movie> findMovies();
}
