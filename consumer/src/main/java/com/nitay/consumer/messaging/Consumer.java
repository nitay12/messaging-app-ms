package com.nitay.consumer.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String message) {
        log.info("Message received:  '" + message + "'");
    }
}
