package cn.linuxhub.www.service;

// 接口文件 UserService

import java.util.List;
import cn.linuxhub.www.po.User;

public interface UserService {

	// 查询所有
	List<User> getAllUsers();

	// 删除数据
	void deleteUser(Integer id);
}