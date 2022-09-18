package com.sofmusic.main.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "videos")
public class Video {
    
    @Id
    private String videoId;
    
    private String ytbVidUrl;
    
    public Video() {
        super();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getYtbVidUrl() {
        return ytbVidUrl;
    }

    public void setYtbVidUrl(String ytbVidUrl) {
        this.ytbVidUrl = ytbVidUrl;
    }
    
}
