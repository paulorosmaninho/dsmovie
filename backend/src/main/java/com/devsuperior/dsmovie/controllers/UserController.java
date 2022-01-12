package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.services.UserService;

@RestController
public class UserController {

	@Autowired 
	UserService userService;
	
	
}
