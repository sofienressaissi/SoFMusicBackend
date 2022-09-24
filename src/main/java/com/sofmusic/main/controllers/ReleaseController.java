package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.ReleaseBusiness;
import com.sofmusic.main.entities.Release;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000"})
public class ReleaseController {
    
    @Autowired
    private ReleaseBusiness releaseBusiness;
    
    @GetMapping("/release/allReleases")
    public List<Release> getAllReleases() {
        return releaseBusiness.getAllReleases();
    }
    
    @GetMapping("/admin/allReleases")
    public List<Release> getAllReleasesAdmin() {
        return releaseBusiness.getAllReleases();
    }
    
}
