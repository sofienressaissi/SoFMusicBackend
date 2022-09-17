package com.sofmusic.main.entities;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "releases")
public class Release {

    @Id
    private String releaseId;
    
    private String releaseType;
    
    private Object[] tracks;
    
    private String spLink;
    
    private String dzLink;
    
    private String amLink;
    
    private Date releaseDate;
    
    private String releaseCover;
    
    private String coverName;
    
    private String public_id;
    
    private String releasePath;
    
    public Release() {
        super();
    }

    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public String getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public Object[] getTracks() {
        return tracks;
    }

    public void setTracks(Object[] tracks) {
        this.tracks = tracks;
    }

    public String getSpLink() {
        return spLink;
    }

    public void setSpLink(String spLink) {
        this.spLink = spLink;
    }

    public String getDzLink() {
        return dzLink;
    }

    public void setDzLink(String dzLink) {
        this.dzLink = dzLink;
    }

    public String getAmLink() {
        return amLink;
    }

    public void setAmLink(String amLink) {
        this.amLink = amLink;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseCover() {
        return releaseCover;
    }

    public void setReleaseCover(String releaseCover) {
        this.releaseCover = releaseCover;
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }

    public String getPublic_id() {
        return public_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public String getReleasePath() {
        return releasePath;
    }

    public void setReleasePath(String releasePath) {
        this.releasePath = releasePath;
    }
    
    

}
