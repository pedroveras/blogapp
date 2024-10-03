package com.pedrosessions.blogapp.repository;

import com.pedrosessions.blogapp.model.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
