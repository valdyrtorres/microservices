package com.valdirtorres.pagamento.repository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8996323857603215092L;
	
	public ResourceNotFoundException(String exception) {
		super(exception);
	}

}
