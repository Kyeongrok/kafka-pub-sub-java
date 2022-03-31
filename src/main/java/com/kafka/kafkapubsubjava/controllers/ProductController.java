package com.kafka.kafkapubsubjava.controllers;

import com.kafka.kafkapubsubjava.domains.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    private HashMap<String, String> hm;

    @PostMapping(value = "/add")
    public ResponseEntity add(@RequestBody Product product) {
        return ResponseEntity.ok("add success");
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable long id, @RequestBody Product product) {

    }

}
