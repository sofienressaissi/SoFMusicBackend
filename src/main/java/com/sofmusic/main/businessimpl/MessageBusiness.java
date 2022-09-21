package com.sofmusic.main.businessimpl;

import com.sofmusic.main.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofmusic.main.entities.Message;
import com.sofmusic.main.ibusiness.IMessageBusiness;

@Service
public class MessageBusiness implements IMessageBusiness {
    
    @Autowired
    private MessageRepository msgRepo;
    
    @Override
    public Message sendMessage(Message message) {
        msgRepo.save(message);
        return message;
    }
    
}
