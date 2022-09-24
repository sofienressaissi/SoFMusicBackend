package com.sofmusic.main.businessimpl;

import com.sofmusic.main.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofmusic.main.entities.Message;
import com.sofmusic.main.ibusiness.IMessageBusiness;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageBusiness implements IMessageBusiness {
    
    @Autowired
    private MessageRepository msgRepo;
    
    @Override
    public List<Message> getAllMessages() {
        List<Message> messages = msgRepo.findAll();
		if (!messages.isEmpty()) {
			return messages;
		} else {
			return new ArrayList<>();
		}
    }
    
    @Override
    public Message sendMessage(Message message) {
        msgRepo.save(message);
        return message;
    }
    
}
