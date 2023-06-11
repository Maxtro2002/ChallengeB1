package com.exerciseB1.productsCrud.controller;

import com.exerciseB1.productsCrud.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private RabbitMQProducer producer;

    public MessageController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producer.send(message);
        return ResponseEntity.ok("Message sent to the RabbitMQ Successfully");
    }
}
