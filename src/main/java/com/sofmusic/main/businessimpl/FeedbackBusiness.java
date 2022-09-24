package com.sofmusic.main.businessimpl;

import com.sofmusic.main.entities.Feedback;
import com.sofmusic.main.ibusiness.IFeedbackBusiness;
import com.sofmusic.main.repositories.FeedbackRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackBusiness implements IFeedbackBusiness {
    
    @Autowired
    private FeedbackRepository feedbackRepo;
    
    @Override
    public List<Feedback> getAllFeedbacks() {
        List<Feedback> feedbacks = feedbackRepo.findAll();
		if (!feedbacks.isEmpty()) {
			return feedbacks;
		} else {
			return new ArrayList<>();
		}
    }
    
    @Override
    public List<Feedback> updateUnread() {
        List<Feedback> feedbacks = feedbackRepo.findAll();
        if (!feedbacks.isEmpty()) {
            for (int f = 0; f < feedbacks.size(); f++) {
                if (feedbacks.get(f).getUnread().equals(Boolean.TRUE)) {
                   feedbacks.get(f).setUnread(Boolean.FALSE); 
                   feedbackRepo.save(feedbacks.get(f));
                }
            }
            return feedbacks;
        } else {
            return new ArrayList<>();
        }
    }
    
    @Override
    public Feedback sendFeedback(Feedback feedback) {
        feedback.setReacted(Boolean.FALSE);
        feedback.setUnread(Boolean.TRUE);
        feedbackRepo.save(feedback);
        return feedback;
    }
    
}
