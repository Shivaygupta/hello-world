package com.example.gitexplore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @GetMapping("gitExplore")
    public String gitExplore(){
        return "git explore";
    }
}
