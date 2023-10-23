package com.assignment.assignment.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_info")
public class User {
    // table columns userId , commentFrom , commentTo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private long userId ;

    @Column(name = "username" , length = 25, nullable = false)
    private String userName ;

    @Column(name = "commentfrom" , length = 25, nullable = false)
    private String commentFrom ;

    @Column(name = "commentto" ,  length = 25, nullable = false)
    private String commentTo ;

    @OneToMany(mappedBy = "postedByUserId")
    private Set<Comment> comments = new HashSet<>();

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Comment comment) {
        comments.add(comment);
    }

    // default constructor
    public User() {
    }

    // parametrize constructor
    public User(String userName , String commentFrom, String commentTo) {
        this.userName = userName;
        this.commentFrom = commentFrom;
        this.commentTo = commentTo;
    }


    // getters method for userId , commentFrom , commentTo
    public long getUserId() {
        return userId;
    }

    public String getCommentFrom() {
        return commentFrom;
    }

    public String getCommentTo() {
        return commentTo;
    }

    // setter method for commentFrom and commentTo
    public void setCommentFrom(String commentFrom) {
        this.commentFrom = commentFrom;
    }

    public void setCommentTo(String commentTo) {
        this.commentTo = commentTo;
    }
}
