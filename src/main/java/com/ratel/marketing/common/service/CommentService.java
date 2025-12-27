package com.ratel.marketing.common.service;

import com.ratel.marketing.common.model.Comment;
import com.ratel.marketing.common.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CommentService(CommentRepository commentRepository) {
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Comment> getAllCommentByTargetId(String targetId) {
        return commentRepository.findAllByTargetId(targetId);
    }
}
