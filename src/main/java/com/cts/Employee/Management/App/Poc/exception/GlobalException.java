package com.cts.Employee.Management.App.Poc.exception;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cts.Employee.Management.App.Poc.payload.AppModelResponse;






@RestControllerAdvice
public class GlobalException {
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(Exception.class)
//public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
//		Map<String, String> errorMap = new HashMap<>();
//		ex.getBindingResult().getFieldErrors().forEach(error -> {
//			errorMap.put(error.getField(), error.getDefaultMessage());
//		});
//		return errorMap;
//	}
//	
	  Logger logger = LoggerFactory.getLogger(GlobalException.class);
	@ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<AppModelResponse> resourceNotFoundExceptionHandler(ResourcesNotFoundException ex) {
        String message = ex.getMessage();
        logger.trace(message);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new AppModelResponse(message));
    }

 

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        {
            Map<String, String> resp = new HashMap<>();
            ex.getBindingResult().getAllErrors().forEach((error) -> {
                String fieldName = ((FieldError) error).getField();
                String message = error.getDefaultMessage();
                resp.put(fieldName, message);
                logger.trace(message);
            });
            return new ResponseEntity<Map<String, String>>(resp, HttpStatus.BAD_REQUEST);
        }
        
        
    }

	
	
		
	}
	
	


