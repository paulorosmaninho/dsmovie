package com.devsuperior.dsmovie.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {
	
	@Autowired 
	MovieRepository movieRepository;
	
	@Transactional
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
	
	
	@Transactional(readOnly = true) /*readOnly para mais performance*/
	public Page<MovieDTO> findAll(Pageable pageable){
		//Retorna uma lista de Movies
		Page<Movie> result = movieRepository.findAll(pageable);
		//Converte a lista de Movies para MovieDTO e devolve para o controller
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}

	
	@Transactional(readOnly = true) /*readOnly para mais performance*/
	public MovieDTO findById(Long id){
		Optional<Movie> movie = movieRepository.findById(id);
		
		if(!movie.isPresent()) {
			throw new ResourceNotFoundException(id); 
		}

		//Converte a lista de Movies para MovieDTO e devolve para o controller
		MovieDTO movieDTO = new MovieDTO(movie.get());
		return movieDTO;
	}

}
