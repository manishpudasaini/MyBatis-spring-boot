package com.example.mybatis.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ExceptionMessage {
    private String message;
    private HttpStatus httpStatus;

    public ExceptionMessage(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
