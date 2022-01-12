package com.devsuperior.dsmovie.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.services.UserService;

@RestController
public class UserResource {

	@Autowired UserService userService;
	
	
}
