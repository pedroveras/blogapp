package com.pedrosessions.blogapp.controller.v1;

import com.pedrosessions.blogapp.model.dto.NewPostDto;
import com.pedrosessions.blogapp.service.PostService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public void getPosts() {

    }

    @PostMapping
    public void newPost(@Valid @RequestBody NewPostDto newPostDto) {
        postService.savePost(newPostDto);
    }
}
