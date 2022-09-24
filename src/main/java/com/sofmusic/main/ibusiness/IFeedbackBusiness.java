package com.sofmusic.main.ibusiness;

import com.sofmusic.main.entities.Feedback;
import java.util.List;

public interface IFeedbackBusiness {
    
    public List<Feedback> getAllFeedbacks();
    public List<Feedback> updateUnread();
    public Feedback sendFeedback(Feedback feedback);
    
}
