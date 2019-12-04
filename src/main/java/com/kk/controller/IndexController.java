package com.kk.controller;

import com.kk.util.ShiroUtils;
import com.kk.util.constant.ConstantShiro;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home")
    public String home(HttpServletRequest request, Model model) {
        return "index/index";
    }

    @RequestMapping(value = "/navbar")
    public String navbar(Model model) {
        return "index/navbar";
    }

}
