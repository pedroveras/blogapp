package com.pedrosessions.blogapp.model.dto;

public record ApiResponse<T> (boolean success, String message, T data) {}
