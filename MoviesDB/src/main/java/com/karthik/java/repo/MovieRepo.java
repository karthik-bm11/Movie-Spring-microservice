package com.karthik.java.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.karthik.java.model.Movie;

public interface MovieRepo extends MongoRepository<Movie, Integer> {

}
