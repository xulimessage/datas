package com.leo.datas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/gongan")
    public String gongan() {
        return "gongan";
    }
}
