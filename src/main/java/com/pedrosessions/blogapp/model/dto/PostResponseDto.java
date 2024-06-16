package com.pedrosessions.blogapp.model.dto;

import com.pedrosessions.blogapp.model.entity.Post;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record PostResponseDto (@NotBlank String author, @NotBlank String title, @NotBlank String content, LocalDateTime creationDate){
}
