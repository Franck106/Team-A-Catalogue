package fr.eql.teama.catalogue.entities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AlreadyExistException extends RuntimeException{
    public AlreadyExistException() {}
    public AlreadyExistException(String message){
        super(message);
    }
    public AlreadyExistException(Throwable cause) {
        super(cause);
    }
    public AlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
