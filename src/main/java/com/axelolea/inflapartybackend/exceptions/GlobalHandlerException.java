package com.axelolea.inflapartybackend.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(NotFoundResourceException.class)
    ResponseEntity<ErrorObject> NotFoundResource (
            NotFoundResourceException ex
    ) {

        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorObject obj = ErrorObject.builder()
                .message(ex.getMessage())
                .timestamp(new Date())
                .statusCode(status.value())
                .build();

        return new ResponseEntity<>(obj, status);
    }

}
