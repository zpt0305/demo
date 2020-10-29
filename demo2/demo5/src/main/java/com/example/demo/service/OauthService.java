package com.example.demo.service;

import com.example.demo.entity.Oauth;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OauthService {
    void insert_oauth(Oauth oauth);
    void delete_oauth(Oauth oauth);
    void update_oauth(Oauth oauth);
    List<Oauth> select_oauth(Oauth oauth);

    //角色授权
    List<Oauth> authorize_role(Oauth oauth);

    //菜单授权
    List<Oauth> authorize_menu(Oauth oauth);


}
