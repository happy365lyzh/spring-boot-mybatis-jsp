package com.liu.web;

import com.liu.dao.UserDao;
import com.liu.entitys.User;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @COMPANY:
 * @CLASS:IndexController
 * @DESCRIPTION:
 * @AUTHOR:LYZH
 * @VERSION:v1.0
 * @DATE:2017/3/29
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}")
    @ResponseBody
    public User findUser(@PathVariable Integer id){
        User user = userService.findUserById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/index/{id}")
    public String index(@PathVariable Integer id, Model model){
        User user = userService.findUserById(id);
        System.out.println(user);
        model.addAttribute("user",user);
        return "index";
    }
}
