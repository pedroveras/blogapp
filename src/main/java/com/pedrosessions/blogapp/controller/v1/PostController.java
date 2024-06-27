package com.pedrosessions.blogapp.controller.v1;

import com.pedrosessions.blogapp.model.dto.NewPostDto;
import com.pedrosessions.blogapp.model.dto.PostResponseDto;
import com.pedrosessions.blogapp.service.PostService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public void newPost(@Valid @RequestBody NewPostDto newPostDto) {
        postService.savePost(newPostDto);
    }

    @GetMapping("/{postId}")
    public void getPost(@NotBlank @PathVariable String postId) {
        postService.getSinglePost(postId);
    }

    @GetMapping
    public ResponseEntity<List<PostResponseDto>> getPosts() {
        return new ResponseEntity<>(postService.getPosts(), HttpStatus.OK);
    }
}
