package com.java.store.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class AdminController {

    @GetMapping("/health")
    public ResponseEntity<?> health(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
