package com.pedrosessions.blogapp.service;

import com.pedrosessions.blogapp.exception.EntityNotFoundException;
import com.pedrosessions.blogapp.model.dto.NewPostDto;
import com.pedrosessions.blogapp.model.dto.PostResponseDto;
import com.pedrosessions.blogapp.model.entity.Post;
import com.pedrosessions.blogapp.model.mapper.PostMapper;
import com.pedrosessions.blogapp.model.mapper.PostMapperImpl;
import com.pedrosessions.blogapp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public void savePost(NewPostDto newPostDto) {
        postRepository.save(newPostDto.toPost());
    }

    public Post getSinglePost(String postId) {
        Optional<Post> post = postRepository.findById(postId);

        if (post.isPresent())
            return post.get();

        throw new EntityNotFoundException("Post not found!");
    }

    public List<PostResponseDto> getPosts() {
        List<Post> posts = postRepository.findAll();
        return postMapper.postListPostResponseDtoList(posts);
    }

}
