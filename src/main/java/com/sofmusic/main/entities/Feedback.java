package com.sofmusic.main.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedbacks")
public class Feedback {
    
    @Id
    private String feedbackId;
    
    private String fullName;
    
    private String email;
    
    private String content;
    
    private Boolean reacted;
    
    private Boolean unread;
    
    public Feedback() {
        super();
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getReacted() {
        return reacted;
    }

    public void setReacted(Boolean reacted) {
        this.reacted = reacted;
    }

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }
    
}
