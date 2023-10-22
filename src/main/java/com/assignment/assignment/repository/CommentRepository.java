package com.assignment.assignment.repository;

import com.assignment.assignment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment , Integer> {
}
