package com.kafka.kafkapubsubjava.controllers;

import com.kafka.kafkapubsubjava.domains.Product;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    private HashMap<String, String> hm;

    @PostMapping(value = "/add")
    public void add(@RequestBody Product product) {

    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable long id, @RequestBody Product product) {

    }

}
