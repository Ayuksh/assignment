package com.assignment.assignment.service;

import com.assignment.assignment.repository.CommentRepository;
import com.assignment.assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private CommentRepository commentRepository;
}
