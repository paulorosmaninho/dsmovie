package com.devsuperior.dsmovie.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Registro não encontrado. Id informado: " + id );
	}
}
