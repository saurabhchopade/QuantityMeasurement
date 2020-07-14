package com.bridgelabz.quantitymeasurement.exception;

public class QuantityException extends Exception {
    public enum ExceptionType {
        GIVENNULLVALUE;
    }

    public ExceptionType type;

    public QuantityException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
