package com.platform.scancenter.handler;

import com.platform.scancenter.enumeration.DefaultException;
import com.platform.scancenter.error.ErrorObject;
import com.platform.scancenter.exception.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Objects;

/**
 * TranCung
 * 19/07/2022
 * Exception Handler
 */
@ControllerAdvice(basePackages = {"com.platform.scancenter.controller"})
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {BadRequestException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorObject> badRequestException(BadRequestException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(
                        Objects.nonNull(exception) ?
                                exception.getError() :
                                DefaultException.BAD_REQUEST.buildResponse()
                );
    }

}
