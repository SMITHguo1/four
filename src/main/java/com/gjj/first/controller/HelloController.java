package com.gjj.first.controller;

import com.gjj.first.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book book = new Book();

        book.setName("555");
        book.setAuthor("tom");
        book.setPrice(30.2f);
        book.setPublicationDate(new Date());

        return book;

    }
}
