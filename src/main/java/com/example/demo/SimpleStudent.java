package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class SimpleStudent {
    @GetMapping("get")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello Google Cloud");
    }
}
