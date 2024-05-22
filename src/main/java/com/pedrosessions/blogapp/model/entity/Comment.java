package com.pedrosessions.blogapp.model.entity;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;

public class Comment {
    private String author;
    private String content;
    private LocalDateTime creationDate;

    @DocumentReference
    private Post post;

    public String getAuthor() {
        return author;
    }

    public Comment setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Comment setContent(String content) {
        this.content = content;
        return this;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Comment setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
