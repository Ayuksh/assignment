package com.assignment.assignment.controller;

import com.assignment.assignment.model.Comment;
import com.assignment.assignment.model.CommentHelper;
import com.assignment.assignment.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {

    @Autowired
    Service service ;
   @PostMapping("/add")
    public String addComment(@RequestBody CommentHelper commentHelper)
    {
        return service.addComment(commentHelper);
    }
}
