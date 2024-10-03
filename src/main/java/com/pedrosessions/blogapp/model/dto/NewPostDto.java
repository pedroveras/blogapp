package com.pedrosessions.blogapp.model.dto;

import com.pedrosessions.blogapp.model.entity.Post;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record NewPostDto(@NotBlank String author, @NotBlank String title, @NotBlank String content) {

    public Post toPost() {
        return new Post()
                .setAuthor(author)
                .setTitle(title)
                .setContent(content);
    }
}
