package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.FeedbackBusiness;
import com.sofmusic.main.dtos.FeedbackDTO;
import com.sofmusic.main.entities.Feedback;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000"})
public class FeedbackController {
    
    @Autowired
    private FeedbackBusiness feedbackBusiness;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/send-feedback")
    public Feedback sendFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        Feedback feedback = convertToEntity(feedbackDTO);
        return feedbackBusiness.sendFeedback(feedback);
    }

    private Feedback convertToEntity(FeedbackDTO feedbackDTO) {
        return modelMapper.map(feedbackDTO, Feedback.class);
    }
    
}
