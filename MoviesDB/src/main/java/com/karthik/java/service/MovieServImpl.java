package com.karthik.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.java.model.Movie;
import com.karthik.java.repo.MovieRepo;

@Service
public class MovieServImpl implements MovieService{
	
	

	@Autowired
	MovieRepo movieRepo;
	
	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
