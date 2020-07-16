package com.bridgelabz.quantitymeasurement.exception;

public class QuantityException extends Exception {
    public enum ExceptionType {
        GIVENNULLVALUE,ILLEGALTYPE;
    }

    public ExceptionType type;

    public QuantityException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
