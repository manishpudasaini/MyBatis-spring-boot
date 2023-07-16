package com.example.mybatis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandller {

    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<Object> apiHandelException(UserNotFoundException userNotFoundException){
        ExceptionMessage exceptionMessage=  new ExceptionMessage(
                userNotFoundException.getMessage(),
                HttpStatus.BAD_REQUEST
        );

        return new ResponseEntity<>(exceptionMessage,HttpStatus.BAD_REQUEST);
    }
}
