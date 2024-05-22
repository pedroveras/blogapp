package com.pedrosessions.blogapp.service;

import com.pedrosessions.blogapp.model.dto.NewPostDto;
import com.pedrosessions.blogapp.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void savePost(NewPostDto newPostDto) {
        postRepository.save(newPostDto.toPost());
    }

}
