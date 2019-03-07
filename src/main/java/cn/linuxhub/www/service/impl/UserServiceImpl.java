package cn.linuxhub.www.service.impl;

// 实现类
// 创建 UserService 接口的实现类 UserServiceImpl

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import cn.linuxhub.www.mapper.UserMapper;

import cn.linuxhub.www.po.User;
import cn.linuxhub.www.service.UserService;

@Service
@Transactional

public class UserServiceImpl implements UserService{

	// 注入用户 Mapper
	@Autowired
	private UserMapper userMapper;

	// 查询所有用户
	public List<User> getAllUsers() {
		return this.userMapper.getAllUsers();
	}

	// 删除用户
	public void deleteUser(Integer id){
		System.out.println("删除了id为"+id+"的用户");
		this.userMapper.delete(id);	
	}

}

