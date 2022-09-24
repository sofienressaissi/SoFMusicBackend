package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.VideoBusiness;
import com.sofmusic.main.dtos.VideoDTO;
import com.sofmusic.main.entities.Video;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000"})
public class VideoController {
    
    @Autowired
    private VideoBusiness videoBusiness;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @PostMapping("/add-video")
    public Video addNewVideo(@RequestBody VideoDTO videoDTO) {
        Video video = convertToEntity(videoDTO);
        return videoBusiness.addNewVideo(video);
    }
    
    @GetMapping("/allVideos")
    public List<Video> getAllVideos() {
        return videoBusiness.getAllVideos();
    }
    
    @GetMapping("/admin/allVideos")
    public List<Video> getAllVideosAdmin() {
        return videoBusiness.getAllVideos();
    }
    
    private Video convertToEntity(VideoDTO videoDTO) {
        return modelMapper.map(videoDTO, Video.class);
    }
    
}
