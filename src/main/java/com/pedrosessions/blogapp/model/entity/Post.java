package com.pedrosessions.blogapp.model.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Post {
    @Id
    private String id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime creationDate;

}
