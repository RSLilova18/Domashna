package com.example.raya04;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class about {

    @GetMapping("/about")
    public String info(){
        return "My name is Raya, I am 18 years old and I live in Burgas, Bulgaria.";
    }
}