package com.nitay.producer.services;

import com.nitay.producer.dto.MessageDto;
import com.nitay.producer.messaging.Producer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessagesService {
    private final Producer producer;

    public void send(MessageDto message) {
        producer.send(message.getMessage());
        log.info("message sent: '" + message.getMessage() + "'");
    }
}
