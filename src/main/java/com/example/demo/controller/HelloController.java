package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<String> helloWorld(@Value("${docker.APPENV}") String envVariable){
        return ResponseEntity.ok("hello world ".concat(envVariable));
    }

}
