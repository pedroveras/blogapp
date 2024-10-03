package com.pedrosessions.blogapp.service;

import com.pedrosessions.blogapp.exception.EntityNotFoundException;
import com.pedrosessions.blogapp.model.dto.NewCommentDto;
import com.pedrosessions.blogapp.model.entity.Comment;
import com.pedrosessions.blogapp.model.entity.Post;
import com.pedrosessions.blogapp.repository.CommentRepository;
import com.pedrosessions.blogapp.repository.PostRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    public CommentService (CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public void addComment(String postId, NewCommentDto newCommentDto) {
        if (!ObjectId.isValid(postId))
            throw new EntityNotFoundException("Post not found!");

        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found!"));

        Comment comment = commentRepository.save(newCommentDto.toComment());

        post.getComments().add(comment);
        postRepository.save(post);


//        postOptional.ifPresentOrElse(
//                post -> commentRepository.save(newCommentDto.toComment()),
//                () -> { throw new EntityNotFoundException("Post not found!"); }
//        );

//        if (post.isPresent()) {
//            post = commentRepository.save(newCommentDto.toComment());
//
//        }

        //throw new EntityNotFoundException("Post not found!");
    }
}
