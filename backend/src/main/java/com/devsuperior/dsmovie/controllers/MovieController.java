package com.devsuperior.dsmovie.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired 
	MovieService movieService;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable){
		Page<MovieDTO> page = movieService.findAll(pageable);
		return ResponseEntity.ok().body(page);
	}
	
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id){
		MovieDTO movieDTO = movieService.findById(id);
		return ResponseEntity.ok().body(movieDTO);
	}
	
	
	
    @PostMapping
    public ResponseEntity<Movie> salvar(@RequestBody MovieDTO movieDTO) {

    	Movie movie = movieService.save(movieDTO.transformToMovie());
        
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(movie.getId())
				.toUri();
        return ResponseEntity.created(uri).body(movie);
    }

}
