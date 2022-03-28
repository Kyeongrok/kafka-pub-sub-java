package com.kafka.kafkapubsubjava.controllers;

import com.kafka.kafkapubsubjava.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaSampleProducerService;

    @GetMapping(value = "/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        return id;
    }

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        kafkaSampleProducerService.sendMessage(message);
    }

}
