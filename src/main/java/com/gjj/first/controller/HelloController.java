package com.gjj.first.controller;

import com.gjj.first.entity.Book;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/book")
    public Book book(){
        Book book = new Book();
        book.setName("西游记");
        book.setAuthor("罗贯中");
        book.setPrice(30.2f);
        book.setPublicationDate(new Date());

        return book;

    }

}
