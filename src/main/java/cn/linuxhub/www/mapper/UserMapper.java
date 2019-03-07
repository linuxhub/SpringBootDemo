package cn.linuxhub.www.mapper;

// 创建接口文件 UserMapper

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import cn.linuxhub.www.po.User;

// @Mapper是MyBatis框架用于声明Mapper接口的注解
// @Select是用于映射查询SQL语句的注解
// @Delete是用于映射删除SQL语句的注解

@Mapper
public interface UserMapper {

	// 查询用户
	@Select("select * from tb_user")
	List<User> getAllUsers();

	// 删除用户
	@Delete("DELETE FROM tb_user WHERE id =#{id}")
	void delete(Integer id);
}
