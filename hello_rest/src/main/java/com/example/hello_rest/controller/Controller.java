package com.example.hello_rest.controller;


import com.example.hello_rest.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/message")
    public Message getMessage(){
        return new Message(3,"Hallo Rset");
    }

}
