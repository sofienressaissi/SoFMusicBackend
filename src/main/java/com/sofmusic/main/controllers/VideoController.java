package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.VideoBusiness;
import com.sofmusic.main.entities.Video;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000"})
public class VideoController {
    
    @Autowired
    private VideoBusiness videoBusiness;
    
    @GetMapping("/allVideos")
    public List<Video> getAllVideos() {
        return videoBusiness.getAllVideos();
    }
    
}