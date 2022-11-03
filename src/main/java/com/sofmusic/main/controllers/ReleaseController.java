package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.ReleaseBusiness;
import com.sofmusic.main.dtos.ReleaseDTO;
import com.sofmusic.main.entities.Release;
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
@RequestMapping("/release")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000", 
    "https://sof-music-admin.netlify.app/"})
public class ReleaseController {
    
    @Autowired
    private ReleaseBusiness releaseBusiness;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @PostMapping("/add-release")
    public Release addNewRelease(@RequestBody ReleaseDTO releaseDTO) {
        Release release = convertToEntity(releaseDTO);
        return releaseBusiness.addNewRelease(release);
    }
    
    @GetMapping("/allReleases")
    public List<Release> getAllReleases() {
        return releaseBusiness.getAllReleases();
    }
    
    private Release convertToEntity(ReleaseDTO releaseDTO) {
        return modelMapper.map(releaseDTO, Release.class);
    }
    
}
