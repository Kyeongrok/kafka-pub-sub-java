package com.kafka.kafkapubsubjava.controllers;

import com.kafka.kafkapubsubjava.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaSampleProducerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        kafkaSampleProducerService.sendMessage(message);
    }

}
