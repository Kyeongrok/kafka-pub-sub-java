package com.kafka.kafkapubsubjava.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test_log", groupId = "testgroup")
    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
    }
}
