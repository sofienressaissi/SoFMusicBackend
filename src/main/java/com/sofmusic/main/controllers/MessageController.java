package com.sofmusic.main.controllers;

import com.sofmusic.main.businessimpl.MessageBusiness;
import com.sofmusic.main.dtos.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sofmusic.main.entities.Message;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"https://sof-music.herokuapp.com", "http://localhost:3000"})
public class MessageController {

    @Autowired
    private MessageBusiness msgBusiness;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/send-message")
    public Message sendMessage(@RequestBody MessageDTO msgDTO) {
        Message message = convertToEntity(msgDTO);
        return msgBusiness.sendMessage(message);
    }

    private Message convertToEntity(MessageDTO msgDTO) {
        return modelMapper.map(msgDTO, Message.class);
    }

}
