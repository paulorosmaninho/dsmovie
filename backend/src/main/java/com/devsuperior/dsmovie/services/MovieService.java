package com.devsuperior.dsmovie.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired MovieRepository movieRepository;
	
	public Movie insert(Movie movie) {
		return movieRepository.save(movie);
	}
	
	
	public Movie findById(Long id) {
		Optional<Movie> obj = movieRepository.findById(id);
		return obj.get();
	}
	
	
	public List<Movie> findAll(){
		return movieRepository.findAll();
	}

}
