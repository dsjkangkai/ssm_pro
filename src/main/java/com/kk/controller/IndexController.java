package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home")
    public String home(Model model) {
        return "index/home";
    }

    @RequestMapping(value = "/navbar")
    public String navbar(Model model) {
        return "index/navbar";
    }

}
