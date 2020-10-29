package com.example.demo.entity;

import lombok.Data;

@Data
public class Role {

    //角色id
    private Long role_id;

    //角色名称
    private String role_name;

    //权限类型
    private String oauth_type;

}
