package xyz.walkingcoders.javahack.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.walkingcoders.javahack.exception.ErrorMessage;
import xyz.walkingcoders.javahack.exception.NotAuthenticatedException;
import xyz.walkingcoders.javahack.exception.NotFoundException;

@RestControllerAdvice
public class JavahackExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> handleNotFoundException(NotFoundException exception) {
        return new ResponseEntity<>(new ErrorMessage(exception.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NotAuthenticatedException.class)
    public ResponseEntity<ErrorMessage> handleNotAuthenticatedException(NotAuthenticatedException exception) {
        return new ResponseEntity<>(new ErrorMessage(exception.getMessage()), HttpStatus.FORBIDDEN);
    }
}
