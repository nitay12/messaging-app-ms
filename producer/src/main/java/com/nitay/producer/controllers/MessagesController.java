package com.nitay.producer.controllers;

import com.nitay.producer.dto.MessageDto;
import com.nitay.producer.services.MessagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
@RequiredArgsConstructor
public class MessagesController {
    private final MessagesService messagesService;
    @PostMapping
    public String sendMessage(@RequestBody MessageDto message){
        messagesService.send(message);
        return "success";
    }
}
