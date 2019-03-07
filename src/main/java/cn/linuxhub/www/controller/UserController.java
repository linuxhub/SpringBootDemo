package cn.linuxhub.www.controller;
// 用户控制器类 UserController

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.linuxhub.www.po.User;
import cn.linuxhub.www.service.UserService;

@RestController

@RequestMapping("/user")
public class UserController{

	// 注入用户 Service
	@Autowired
	private UserService userService;


	// 查询所有用户
	@RequestMapping("/userList")
    public List<User> getAllUser(){
    	List<User> list = this.userService.getAllUsers();
    	return list;
    	
    }

    // 删除用户
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
    	this.userService.deleteUser(id);
    }

}