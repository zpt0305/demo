package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    //增加用户
    public void insert_user(User user){
        userMapper.insert(user);

    }

    @Override
    //删除用户
    public void delete_user(User user){
        userMapper.delete(new QueryWrapper<User>(user) );
    }

    @Override
    public void deleteById_user(Long id ){
        userMapper.deleteById(id);
    }

    @Override
    //更新用户
    public void update_user(User user,QueryWrapper<User> queryWrapper){
        userMapper.update(user,queryWrapper);
    }

    @Override
    //查找用户
    public List<User> select_user(User user){
        return userMapper.selectList(new QueryWrapper<User>(user));
    }

    @Override
    public User selectById_user(Long id){
        return userMapper.selectById(id);
    }


}
