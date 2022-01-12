package com.devsuperior.dsmovie.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.services.MovieService;

@RestController
public class MovieResource {
	
	@Autowired MovieService movieService;

}
