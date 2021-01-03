package com.banco.banco.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ExceptionController {
	
	@ResponseStatus(value=HttpStatus.CONFLICT, reason="Email ou Cpf ja em uso.") //409
	@ExceptionHandler(DataIntegrityViolationException.class)
    public void handleConflict() {
       
    }
}
