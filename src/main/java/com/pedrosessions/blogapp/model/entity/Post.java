package com.pedrosessions.blogapp.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    @Id
    private String id;
    private String title;
    private String content;
    private String author;
    @DocumentReference
    private List<Comment> comments;
    private LocalDateTime creationDate;


    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Post setAuthor(String author) {
        this.author = author;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
