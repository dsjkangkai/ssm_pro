package com.kk.controller;

import com.kk.po.UserPo;
import com.kk.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.registry.infomodel.User;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by kk on 2019-1-25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser")
    public String getUser(Model model , Integer id) {
        if (id == null ) id = 1;
        System.out.println("s");
        model.addAttribute("user", userService.selectById(id));
        return "user/showUser";
    }

    @RequestMapping(value = "golist")
    public String golist(Model model) {

        return "user/list";
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public Map listUser() {
        Map<String, Object> map = new HashMap<>();
        UserPo user = new UserPo();
        map.put("data", userService.select(new HashMap<String, Object>()));
        return map;
    }

    @RequestMapping(value = "goAddEdit")
    public String goAddEdit(Model model) {

        return "user/addEdit";
    }

    @RequestMapping(value = "addEdit")
    @ResponseBody
    public Object addEdit(UserPo user) {
        if (user.getId() ==null){
            userService.insert(user);
        }else {
            userService.update(user);
        }
        return user;
    }


    @RequestMapping(value = "getById")
    @ResponseBody
    public Object getByIdUser(Integer id) {
        return userService.selectById(id);
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Object insertUser(@RequestBody UserPo user) {
        return userService.insert(user);
    }


    @RequestMapping(value = "update")
    @ResponseBody
    public Object updateUser(@RequestBody UserPo user) {
        return userService.update(user);
    }


    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object deleteUser(@RequestBody UserPo user) {
        return userService.delete(user);
    }

    @RequestMapping(value = "deleteByIds")
    @ResponseBody
    public Object deleteUserByIds(@RequestBody Integer[] ids) {
        return userService.deletes(ids);
    }
}
