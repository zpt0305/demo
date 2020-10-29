package com.example.demo;

import com.example.demo.dao.OauthMapper;
import com.example.demo.entity.Oauth;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {
	@Autowired
	OauthMapper oauthMapper;

	@Test
	void delete() {


		oauthMapper.deleteById_oauth(1l);
	}

}
