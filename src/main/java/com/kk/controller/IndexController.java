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
        if (ShiroUtils.getSessionUser() == null){
            //调用权限赋值到session
            SecurityUtils.getSubject().hasRole("");
            //权限集合放在session
            request.getSession().setAttribute("funcionList",
                    SecurityUtils.getSubject().getSession().getAttribute(ConstantShiro.SHIRO_FUNCTIONS));
        }

        return "index/home";
    }

    @RequestMapping(value = "/navbar")
    public String navbar(Model model) {
        return "index/navbar";
    }

}
