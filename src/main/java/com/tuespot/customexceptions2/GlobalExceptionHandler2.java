package com.tuespot.customexceptions2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice()
public class GlobalExceptionHandler2 {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<?> dataNotFoundExceptionHandler(DataNotFoundException ex){
		ExceptionResponse exceptionResponse=new ExceptionResponse();
		exceptionResponse.setMsg(ex.getMessage());
		exceptionResponse.setStatus("false");
		
		return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
}
