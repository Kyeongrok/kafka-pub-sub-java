package com.kafka.kafkapubsubjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSpringConsumer {

    private final TelegramSender telegramSender;

    public KafkaSpringConsumer(TelegramSender telegramSender) {
        this.telegramSender = telegramSender;
    }

    @KafkaListener(topics = "test_log", groupId = "") // groupId를 ""로 두면 application.yml의 groupId가 들어갑니다.
    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
        this.telegramSender.send("receive message:" + message);
    }
}
