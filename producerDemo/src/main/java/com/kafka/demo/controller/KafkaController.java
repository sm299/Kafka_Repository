package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.model.Course;
import com.kafka.demo.service.KafkaService;

@RestController
@RequestMapping("/kafka/publish")
public class KafkaController {

    @Autowired
    private KafkaService service;

    @PostMapping("/addCourse")
    public ResponseEntity<String> addCourse(@RequestBody Course course) {
        String response = service.sendMsg(course);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
