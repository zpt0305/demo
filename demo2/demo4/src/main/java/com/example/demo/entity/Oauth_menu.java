package com.example.demo.entity;

import lombok.Data;

@Data
public class Oauth_menu {

    //菜单id
    private Long menu_id;

    //权限id
    private Long oauth_id;

    //权限菜单关联id
    private Long oauth_menu_id;

}
