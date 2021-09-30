package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Rest컨트롤러로 사용할 것임을 Annotation을 통해 명시해주는 것이 좋음
//해당 Class는 REST API를 처리하는 Controller

@RequestMapping("/api")
//RequestMapping은 URI를 지정해주는 Annotation

public class ApiController {

    @GetMapping("/hello")
    //http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot!";
    }


}

