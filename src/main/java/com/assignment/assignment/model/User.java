package com.assignment.assignment.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class User {
    // table columns userId , commentFrom , commentTo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userId ;
    @Column(name = "commentfrom")
    private String commentFrom ;
    @Column(name = "commentto")
    private String commentTo ;


    // default constructor
    public User() {
    }

    // parametrize constructor
    public User(int userId, String commentFrom, String commentTo) {
        this.userId = userId;
        this.commentFrom = commentFrom;
        this.commentTo = commentTo;
    }


    // getters method for userId , commentFrom , commentTo
    public int getUserId() {
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
