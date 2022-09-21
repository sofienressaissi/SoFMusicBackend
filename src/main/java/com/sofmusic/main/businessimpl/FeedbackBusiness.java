package com.sofmusic.main.businessimpl;

import com.sofmusic.main.entities.Feedback;
import com.sofmusic.main.ibusiness.IFeedbackBusiness;
import com.sofmusic.main.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackBusiness implements IFeedbackBusiness {
    
    @Autowired
    private FeedbackRepository feedbackRepo;
    
    @Override
    public Feedback sendFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
        return feedback;
    }
    
}
