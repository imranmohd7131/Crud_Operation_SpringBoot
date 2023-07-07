package com.tuespot.customexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		ExceptionResponse resp = new ExceptionResponse();
		resp.setStatus("false");
		resp.setMessage(ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
	}
}
