package com.gjj.first.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BOOK")
public class BookController {

    @PostMapping("/")
    //@CrossOrigin(value = "http://localhost:8887",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        return "receive:"+name;
    }

    @DeleteMapping("/{id}")
    //@CrossOrigin(value = "http://localhost:8887",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        return String.valueOf(id);
    }
}
