package com.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.demo.model.Course;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, Course> template;

    public String sendMsg(Course course) {
        template.send("Kafka Test", "course", course);
        return "Course message sent to Kafka";
    }
}
