package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
@TableId(value = "user_id",type = IdType.AUTO)    //主键自增
    //用户的id，目前代表工号
    private Long user_id;

    //用户的名字
    private String name;

    //用户部门的id标识
    private Long user_org_id;

    //用户的电子邮件
    private String user_email;

    //用户的电话
    private String user_tel;

    //用户的登录账号
    private String login_name;

    //用户的登陆密码
    private String login_password;

}
