package com.offcn.springbootdemo1.com.offcn.controller;

import com.offcn.springbootdemo1.com.offcn.dao.UserDao;
import com.offcn.springbootdemo1.com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/user/list")
    public List<User> showUserList(){
        return userDao.findAll();
    }
}
