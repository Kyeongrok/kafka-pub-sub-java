package com.kafka.kafkapubsubjava.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/blog")
public class BlogAnalysticController {
    @PostMapping(value = "/")
    public ResponseEntity<String> echo(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + ":" + map.getValue() + "/n");
        });
        return ResponseEntity.ok(sb.toString());
    }
}
