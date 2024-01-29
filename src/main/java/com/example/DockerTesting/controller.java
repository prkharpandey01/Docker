package com.example.DockerTesting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class controller {

    @GetMapping
    public String getuser(){
        return "hello docker is working we are under docker ";
    }

}
