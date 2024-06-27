package com.pedrosessions.blogapp.model.dto;

import com.pedrosessions.blogapp.model.entity.Comment;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record NewCommentDto(@NotEmpty String author, @NotEmpty String content) {
    public Comment toComment() {
        return new Comment()
                .setAuthor(author)
                .setContent(content)
                .setCreationDate(LocalDateTime.now());
    }
}
