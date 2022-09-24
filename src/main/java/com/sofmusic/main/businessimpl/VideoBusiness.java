package com.sofmusic.main.businessimpl;

import com.sofmusic.main.entities.Video;
import com.sofmusic.main.ibusiness.IVideoBusiness;
import com.sofmusic.main.repositories.VideoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoBusiness implements IVideoBusiness {
    
    @Autowired
    private VideoRepository videoRepo;
    
    @Override
    public Video addNewVideo(Video video) {
        videoRepo.save(video);
        return video;
    }
    
    @Override
    public List<Video> getAllVideos() {
        List<Video> videos = videoRepo.findAll();
		if (!videos.isEmpty()) {
			return videos;
		} else {
			return new ArrayList<>();
		}
    }
    
}
