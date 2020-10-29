package com.example.demo.entity;

import lombok.Data;

@Data
public class Organization {

    //组织id
    private Long org_id;

    //父级组织id
    private Long org_parnetid;

    //组织的名字
    private String  org_name;

}
