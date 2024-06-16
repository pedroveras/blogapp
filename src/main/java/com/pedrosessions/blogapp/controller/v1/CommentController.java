package com.pedrosessions.blogapp.controller.v1;

import com.pedrosessions.blogapp.model.dto.NewCommentDto;
import com.pedrosessions.blogapp.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts/comment/{postId}")
    public void newComment(@RequestBody NewCommentDto newCommentDto, @PathVariable String postId) {
        commentService.addComment(postId, newCommentDto);
    }
}
