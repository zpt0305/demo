package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //调用service增加用户信息
    @GetMapping("/insert/user")
    public void insert(User user){
        userService.insert_user(user);
    }

    //调用service删除用户
    @GetMapping("/delete/user")
    public void delete(User user){
        userService.delete_user(user);
    }

    //调用service通过userid删除用户
    @GetMapping("/deleteById/user")
    public void deleteById(Long id){
        userService.deleteById_user(id);
    }

    //调用service更新用户
    @GetMapping("/update/user")
    public void update(User user, QueryWrapper<User> queryWrapper){
        userService.update_user(user,queryWrapper);
    }

    //调用service查找用户
    @GetMapping("/select/user")
    public List<User> select(User user){
        return userService.select_user(user);
    }

    //调用service通过id查找用户
    @GetMapping("/selectById/user")
    public User selectById(Long id){
        return userService.selectById_user(id);
    }

}
