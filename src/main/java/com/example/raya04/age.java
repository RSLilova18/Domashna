package com.example.raya04;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class age {

    @GetMapping("/age")
    public String info(){
        return "18 years old";
    }
}