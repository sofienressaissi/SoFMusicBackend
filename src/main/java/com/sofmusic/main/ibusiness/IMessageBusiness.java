package com.sofmusic.main.ibusiness;

import com.sofmusic.main.entities.Message;
import java.util.List;

public interface IMessageBusiness {
    
    public List<Message> getAllMessages();
    public Message sendMessage(Message message);
    
}
