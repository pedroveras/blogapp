package com.pedrosessions.blogapp.model.dto;

import com.pedrosessions.blogapp.model.entity.Comment;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record NewCommentDto(@NotBlank String author, @NotBlank String content) {
    public Comment toComment() {
        return new Comment()
                .setAuthor(author)
                .setContent(content)
                .setCreationDate(LocalDateTime.now());
    }
}
