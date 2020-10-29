package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper u;

    @PostMapping("/user/select")
    public User getUserMassage(@RequestBody User user){
        user.setUser_id(1208L);
        return u.selectOne(new QueryWrapper<User>().eq("user_id",1208L));

    }

    @PostMapping("/user/insert")
    public User getinsertMassge(@RequestBody User user){
        user.setUser_id(1209L);
        user.setLogin_name("徐青青");
        return user;
    }



}
