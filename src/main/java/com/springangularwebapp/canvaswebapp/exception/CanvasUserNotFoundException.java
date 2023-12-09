package com.springangularwebapp.canvaswebapp.exception;

public class CanvasUserNotFoundException extends RuntimeException {
    public CanvasUserNotFoundException(String message) {
        super(message);
    }
}