package com.demo.searchservice.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RestaurentNotFoundException extends RuntimeException {

	public RestaurentNotFoundException(String exception) {
		super(exception);
	}

	public RestaurentNotFoundException() {
		// TODO Auto-generated constructor stub
	}

}
