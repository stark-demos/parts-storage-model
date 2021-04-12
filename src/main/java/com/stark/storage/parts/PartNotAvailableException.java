package com.stark.storage.parts;

public class PartNotAvailableException extends Exception {
    private static final long serialVersionUID = 1L;

    public PartNotAvailableException(String message) {
        super(message);
    }   
}
