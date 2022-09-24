package com.sofmusic.main.ibusiness;

import com.sofmusic.main.entities.Release;
import java.util.List;

public interface IReleaseBusiness {
    
    public Release addNewRelease(Release release);
    public List<Release> getAllReleases();
    
}
