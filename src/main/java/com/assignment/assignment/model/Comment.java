package com.assignment.assignment.model;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment_info")
public class Comment {
    // table columns commentId , message , commentdatetime , postedbyuserid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid")
    private long commentId ;

    @Column(name = "message" , length = 255, nullable = false)
    private String message ;

    // spring boot will automatically handle the conversion between timesstamp and LocalDateTime
    @Column(name ="commentdatetime" , nullable = false)
    private LocalDateTime commentDateTime  ;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User postedByUserId ;


    // default constructor
    public Comment() {
    }


    // parametrize constructor
    public Comment( String message, LocalDateTime commentDateTime, User postedByUserId) {
        this.message = message;
        this.commentDateTime = commentDateTime;
        this.postedByUserId = postedByUserId;
    }

    // getter and setter  methods
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
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

    public User getPostedByUserId() {
        return postedByUserId;
    }

    public void setPostedByUserId(User postedByUserId) {
        this.postedByUserId = postedByUserId;
    }
}
