package org.example.exception;

public class MissingDataTypeException extends RuntimeException{
    public MissingDataTypeException(String message) {
        super(message);
    }
}

