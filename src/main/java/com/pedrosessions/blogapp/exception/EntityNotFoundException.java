package com.pedrosessions.blogapp.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String s) {
        super(s);
    }
}
