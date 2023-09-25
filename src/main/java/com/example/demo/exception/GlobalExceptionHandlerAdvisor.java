package com.example.demo.exception;

import com.example.demo.dto.response.api.ApiResponse;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandlerAdvisor {

	@ExceptionHandler(value = {MethodArgumentNotValidException.class})
	@ResponseBody
	public ApiResponse<Void> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
		FieldError fieldError = e.getBindingResult().getFieldError();
		String fieldName = fieldError.getField();
		String message = fieldName.concat(" - ").concat(fieldError.getDefaultMessage());
		return ApiResponse.error(999, message);
	}
}
