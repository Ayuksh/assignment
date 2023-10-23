package com.assignment.assignment.model;

public class CommentHelper {
    private String commentFrom ;
    private String commentTo ;
    private String message ;

    public CommentHelper() {
    }

    public CommentHelper(String commentFrom, String commentTo, String message) {
        this.commentFrom = commentFrom;
        this.commentTo = commentTo;
        this.message = message;
    }

    public String getCommentFrom() {
        return commentFrom;
    }

    public void setCommentFrom(String commentFrom) {
        this.commentFrom = commentFrom;
    }

    public String getCommentTo() {
        return commentTo;
    }

    public void setCommentTo(String commentTo) {
        this.commentTo = commentTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
