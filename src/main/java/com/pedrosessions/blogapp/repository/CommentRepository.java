package com.pedrosessions.blogapp.repository;

import com.pedrosessions.blogapp.model.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
