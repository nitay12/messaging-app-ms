package com.nitay.producer.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Producer {
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    public void send(String message) {
        rabbitTemplate.convertAndSend(this.queue.getName(), message);
    }
}
