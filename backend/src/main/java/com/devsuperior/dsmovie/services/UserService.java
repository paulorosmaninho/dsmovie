package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.UserDTO;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.UserRepository;
import com.devsuperior.dsmovie.services.exceptions.DatabaseException;
import com.devsuperior.dsmovie.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepository;

	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}
	
	
	@Transactional(readOnly = true) /*readOnly para mais performance*/
	public UserDTO findById(Long id) {
		//Retorna um User. Foi adicionado o metodo .get() para
		//obter o objeto User dentro do objeto Optional.
		User user = userRepository.findById(id).get();

		if(user==null) {
			throw new ResourceNotFoundException(id); 
		}
		
		UserDTO userDTO = new UserDTO(user);
		return userDTO;
	}
	
	
	@Transactional(readOnly = true) /*readOnly para mais performance*/
	public Page<UserDTO> findAll(Pageable pageable){
		Page<User> user = userRepository.findAll(pageable);
		Page<UserDTO> usersDTO = user.map(x -> new UserDTO(x));
		return usersDTO;
	}
	
	
	@Transactional
	public void deleteById(Long id) {
		try {
			userRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

}
