package com.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.demo.model.Course;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, Course> template;
    private String message;

    @KafkaListener(topics = "kafkaTest", groupId = "kafkaTest-firstConsumerGroup")
    public void consumeMsg(Course course) {
        message = course + "received from Kafka Publisher";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}
