package com.assignment.assignment.service;


import com.assignment.assignment.model.Comment;
import com.assignment.assignment.model.User;
import com.assignment.assignment.repository.CommentRepository;
import com.assignment.assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private CommentRepository commentRepository;


    public void addComment(String commentTo , String commentFrom , String message )
    {
        User user = new User(commentTo , commentFrom , message);
        Comment comment = new Comment(message , LocalDateTime.now() , user);
        user.setComments(comment);
        userRepository.save(user);
        commentRepository.save(comment);
    }
}
