package com.example.tmall.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        return "/hello.html";
    }
}