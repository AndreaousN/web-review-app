package com.webreview.webreviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {

    @GetMapping("/")
    public String viewIndex() {
        return "index";
    }
}
