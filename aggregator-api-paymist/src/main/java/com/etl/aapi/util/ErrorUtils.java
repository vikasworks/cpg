package com.etl.aapi.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class ErrorUtils {
	
	public static String getErrorMessage(BindingResult result){
		FieldError fieldError = result.getFieldError();
		String errorMessage = fieldError.getField() + " " + fieldError.getDefaultMessage();
		return errorMessage;
	}

}
