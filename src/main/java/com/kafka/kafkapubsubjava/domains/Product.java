package com.kafka.kafkapubsubjava.domains;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Product {
    private long id;
    private String name;
    private LocalDateTime updated;
}
