package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.model.Request;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //插入用户
    void insert_user(User user);

    //删除用户
    void delete_user(User user);

    //通过id标识删除用户
    void deleteById_user(Long id);

    //更新用户信息
    void update_user(User user, QueryWrapper<User> queryWrapper);

    //查找用户信息
    List<User> select_user(User user);

    //通过id查找用户
    User selectById_user(Long id);

    List<User> selectByone_user(Request request);
}
