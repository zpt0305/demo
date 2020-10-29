package com.example.demo.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.entity.Oauth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OauthMapper extends BaseMapper<Oauth> {
        //

        //增加权限
        void insert_oauth(Oauth oauth);

        //通过id删除
        void deleteById_oauth(@Param("oauth_id") Long oauth_id);

        //通过id更新
        void updateById_oauth(@Param("oauth_id") Long oauth_id);

        //
        List<Oauth> select_oauth(Oauth oauth);
}
