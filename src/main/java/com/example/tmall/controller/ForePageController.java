package com.example.tmall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ForePageController
 */
@Controller
public class ForePageController {

    @GetMapping("/")
    public String index() {
        return "redirect:home";
    }

    @GetMapping("/home")
    public String home() {
        return "fore/home";
    }

    @GetMapping("/register")
    public String register() {
        return "fore/register";
    }

    @GetMapping("/registerSuccess")
    public String registerSuccess() {
        return "fore/registerSuccess";
    }

    @GetMapping("/login")
    public String login() {
        return "fore/login";
    }

    @GetMapping("/forelogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:home";
    }
}