package com.kafka.kafkapubsubjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSpringProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSpringProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        System.out.println("send message : " + message);
        this.kafkaTemplate.send("test_log", message);
    }

}
