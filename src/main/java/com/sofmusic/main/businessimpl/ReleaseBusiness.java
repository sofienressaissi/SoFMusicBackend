package com.sofmusic.main.businessimpl;

import com.sofmusic.main.ibusiness.IReleaseBusiness;
import com.sofmusic.main.repositories.ReleaseRepository;
import com.sofmusic.main.entities.Release;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseBusiness implements IReleaseBusiness {
    
    @Autowired
    private ReleaseRepository releaseRepo;
    
    @Override
    public List<Release> getAllReleases() {
        List<Release> releases = releaseRepo.findAll();
		if (!releases.isEmpty()) {
			return releases;
		} else {
			return new ArrayList<>();
		}
    }
    
}
