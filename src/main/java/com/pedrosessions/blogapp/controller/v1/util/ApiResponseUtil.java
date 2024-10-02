package com.pedrosessions.blogapp.controller.v1.util;

import com.pedrosessions.blogapp.model.dto.ApiResponse;

public class ApiResponseUtil<T> {
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, "Operation successful", data);
    }

    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(true, message, data);
    }

    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<T>(false, message, null);
    }
}
