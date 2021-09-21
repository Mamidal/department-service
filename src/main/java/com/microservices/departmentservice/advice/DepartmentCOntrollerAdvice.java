package com.microservices.departmentservice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.ResourceAccessException;

//@ControllerAdvice
@RestControllerAdvice
public class DepartmentCOntrollerAdvice {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handelResourceAccessException(Exception resourceAccessException){
		return new ResponseEntity<String>("No Value is present in DB, Please change your value", HttpStatus.NOT_FOUND);
		
	}
}
