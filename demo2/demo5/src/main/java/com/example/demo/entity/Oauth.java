package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName(value = "oauth")
public class Oauth {

    //权限id
    @TableId
    private Long oauth_id;

    //权限名称
    private String oauth_name;

    //权限功能
    private String oauth_disc;

    //创建者id
    private Long create_user_id;

    //创建时间
    private LocalDateTime create_time;

    //最后一个更新者的id
    private Long last_update_user_id;

    //最后的更新时间
    private LocalDateTime last_update_time;

    //是否可删除标识
    private boolean is_delete;




}
