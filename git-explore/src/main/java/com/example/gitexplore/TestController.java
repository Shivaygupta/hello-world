package com.example.gitexplore;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        System.out.println("hi");
        return "echo received";
    }
}
