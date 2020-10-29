package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo3ApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {

		//用户信息

		//角色列表

		//更新用户角色关联表


//		调用过程
		//controller
	//1  入参   *Request
		// service
		//如果有业务 *Request -->*BO  用bo做业务 BO-->entity调用mapper
		//如果没有业务  *Request-->entity 调用mapper

		//反参  new result<*response>



	}
	@Test
	void find(){
		User user = new User();
		user.setName("徐青青");
		List<User> list= userService.select_user(user);
		list.forEach(System.out::println);
	}

	@Test
	void insert(){
		User user = new User();
		user.setName("骆佳齐");
		user.setUser_id(1201L);
		userService.insert_user(user);

	}

	@Test
	void update(){
		QueryWrapper<User> objectQueryWrapper = new QueryWrapper<User>();
		objectQueryWrapper.eq("user_id",1211);
		User user = new User();
		user.setName("骆佳齐");
		userService.update_user(user,objectQueryWrapper);

	}

	@Test
	 void delete(){

		User user = new User();
		user.setName("骆佳齐");
		userService.delete_user(user);

	}

	@Test
	void selectBYID(){

		Long id = 1209L;
		userService.selectById_user(id);

	}











}
