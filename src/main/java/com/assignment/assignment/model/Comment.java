package com.assignment.assignment.model;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment_info")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid")
    private int commentId ;

    @Column(name = "message")
    private String message ;

    // spring boot will automatically handle the conversion between timesstamp and LocalDateTime
    @Column(name ="commentdatetime")
    private LocalDateTime commentDateTime  ;

    @Column(name ="postedbyuserid")
    private int postedByUserId ;


    // default constructor
    public Comment() {
    }


    // parametrize constructor
    public Comment(int commentId, String message, LocalDateTime commentDateTime, int postedByUserId) {
        this.commentId = commentId;
        this.message = message;
        this.commentDateTime = commentDateTime;
        this.postedByUserId = postedByUserId;
    }

    // getter and setter  methods
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommentDateTime(LocalDateTime commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    public int getPostedByUserId() {
        return postedByUserId;
    }

    public void setPostedByUserId(int postedByUserId) {
        this.postedByUserId = postedByUserId;
    }
}
