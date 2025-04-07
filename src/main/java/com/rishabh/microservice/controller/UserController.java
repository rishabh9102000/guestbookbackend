package com.rishabh.microservice.controller;


import com.rishabh.microservice.pojo.Userss;
import com.rishabh.microservice.services.Servicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    Servicess userService;

    @PostMapping()
    public ResponseEntity<Userss> createUser(@RequestParam String name, @RequestParam String message) {
        Userss user = userService.addUser(name, message);
        return ResponseEntity.ok(user);
    }
    @GetMapping
    public Userss getUser(@RequestParam String name) {
        return userService.getUser(name);
    }

    @GetMapping("/")
    public List<Userss> getAlls() {
        return userService.getAll();
    }
}
