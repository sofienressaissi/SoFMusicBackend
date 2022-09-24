package com.sofmusic.main.ibusiness;

import com.sofmusic.main.entities.Video;
import java.util.List;

public interface IVideoBusiness {
    
    public Video addNewVideo(Video video);
    public List<Video> getAllVideos();
    
}
