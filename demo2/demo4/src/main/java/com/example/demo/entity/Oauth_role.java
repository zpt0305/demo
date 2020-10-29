package com.example.demo.entity;

import lombok.Data;

@Data
public class Oauth_role {
    //角色的id
    private Long role_id;

    //权限id
    private Long oauth_id;

    //权限角色关联id（权限赋给角色）
    private Long oauth_role_id;

}
