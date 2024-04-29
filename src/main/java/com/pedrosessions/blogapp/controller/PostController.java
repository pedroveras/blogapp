package com.pedrosessions.blogapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping
    public void getPosts() {

    }

    @PostMapping
    public void newPost() {

    }
}
