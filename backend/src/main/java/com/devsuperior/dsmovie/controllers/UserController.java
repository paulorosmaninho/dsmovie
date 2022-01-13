package com.devsuperior.dsmovie.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dsmovie.dto.UserDTO;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired 
	UserService userService;
	
	@GetMapping
	public ResponseEntity<Page<UserDTO>> findAll(Pageable pageable){
		Page<UserDTO> page = userService.findAll(pageable);
		return ResponseEntity.ok().body(page);
	}
	
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		UserDTO userDTO = userService.findById(id);
		return ResponseEntity.ok().body(userDTO);
	}

	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		userService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
    @PostMapping
    public ResponseEntity<User> salvar(@RequestBody UserDTO userDTO) {

    	User user = userService.save(userDTO.transformToUser());
        
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();
        return ResponseEntity.created(uri).body(user);
    }

}
