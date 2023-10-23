package com.assignment.assignment.service;


import com.assignment.assignment.model.Comment;
import com.assignment.assignment.model.CommentHelper;
import com.assignment.assignment.model.User;
import com.assignment.assignment.repository.CommentRepository;
import com.assignment.assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private CommentRepository commentRepository;


    public String addComment(CommentHelper commentHelper)
    {
        if(!(checkValidity(commentHelper.getCommentTo())) || !(checkValidity(commentHelper.getCommentFrom())))
            return "Invalid Request" ;

        return "valid request";
//        User user = new User(commentTo , commentFrom , message);
//        Comment comment = new Comment(message , LocalDateTime.now() , user);
//        user.setComments(comment);
//        userRepository.save(user);
//        commentRepository.save(comment);
    }

    public boolean checkValidity(String name)
    {
        String regex = "^[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);

        // If the username is empty or has only ' '(blank space) return false
        if (name == null || name.startsWith(" ")) {
            return false;
        }

        Matcher m = p.matcher(name);
        // Return if the username
        // matched the ReGex
        return m.matches();
    }
}
