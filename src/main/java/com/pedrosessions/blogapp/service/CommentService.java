package com.pedrosessions.blogapp.service;

import com.pedrosessions.blogapp.exception.EntityNotFoundException;
import com.pedrosessions.blogapp.model.dto.NewCommentDto;
import com.pedrosessions.blogapp.model.entity.Post;
import com.pedrosessions.blogapp.repository.CommentRepository;
import com.pedrosessions.blogapp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    public CommentService (CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public void addComment(String postId, NewCommentDto newCommentDto) throws EntityNotFoundException{
        Optional<Post> post = postRepository.findById(postId);

        if (post.isPresent()) {
            commentRepository.save(newCommentDto.toComment());
        }

        throw new EntityNotFoundException("Post not found!");
    }
}
