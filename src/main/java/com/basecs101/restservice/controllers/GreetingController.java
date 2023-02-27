package com.basecs101.restservice.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.basecs101.restservice.model.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("Request received : name : {}",name);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}