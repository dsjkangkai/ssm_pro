package com.kk.controller;

import com.kk.po.Function;
import com.kk.service.UserService;
import com.kk.util.ShiroUtils;
import com.kk.util.constant.ConstantShiro;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toLogin")
    public String toLogin(String username, String password, Model model) {
        return "login";
    }

    //实现用户登录
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, String username, String password, Model model) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        String error = null;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (AuthenticationException e) {
            //其他错误，比如锁定，如果想单独处理请单独catch处理
            error = "其他错误：" + e.getMessage();
        }
        System.out.println("error:" + error);

        if (error != null) {//出错了，返回登录页面
            model.addAttribute("error", error);
            return "login1";
        } else {//登录成功
            model.addAttribute("user", userService.getUserByName(username));
            if (ShiroUtils.getSessionUser() == null){
                //调用权限赋值到session
                SecurityUtils.getSubject().hasRole("");
                //权限集合放在session

                //根目录（一级目录）
                List<Function> pfunList = new ArrayList<>();

                List<Function> functionList = (List<Function>) SecurityUtils.getSubject().getSession().getAttribute(ConstantShiro.SHIRO_FUNCTIONS);
                for (Function function : functionList) {
                    if (function.getPid()==0){
                        pfunList.add(function);
                    }
                }

                //二级目录
                for (Function pfun : pfunList) {
                    List<Function> childList = new ArrayList<>();
                    for (Function function : functionList) {
                        if (function.getPid() == pfun.getId()){
                            childList.add(function);
                        }
                    }
                    pfun.setFunctions(childList);
                }



                request.getSession().setAttribute("funcionList",pfunList);
            }
            return "redirect:index/home";
        }
    }



}
