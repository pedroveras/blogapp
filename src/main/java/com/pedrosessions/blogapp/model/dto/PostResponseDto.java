package com.pedrosessions.blogapp.model.dto;

import com.pedrosessions.blogapp.model.entity.Comment;
import com.pedrosessions.blogapp.model.entity.Post;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record PostResponseDto (String id, @NotBlank String author, @NotBlank String title, @NotBlank String content, List<Comment> comments, LocalDateTime creationDate){
}
