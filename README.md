# Java Demo 

构架： Spring Boot
生成： https://start.spring.io

## 环境版本
- Maven Project
- Spring Boot: 2.1.3
- Java Version: 8
- Apache Maven: 3.5.3

## 编译
```
mvn clean package
```

## 运行
```
docker-compose up -d
```

## 访问 
> http://{ip}:8080/hello



## 创建数据库
```
/* 创建 数据库 */
CREATE DATABASE `test_www_db` CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


/* 创建帐号权限 */
create user test_www identified by 'GTdsdf8dsfjhsdH';
grant all privileges on test_www_db.* to 'test_www'@'%';
flush privileges;


/* 操作 数据库 */
use test_www_db;

/* 创建 一个名称为 tb_user 的表*/
CREATE TABLE tb_user( 

	id int(32) PRIMARY KEY AUTO_INCREMENT,
	username varchar(32),
	address varchar(256)	
);


/* 插入3条数据 */
INSERT INTO tb_user VALUES ('1','泽泽',"广州市天河区");
INSERT INTO tb_user VALUES ('2','小白',"广州市白云区");
INSERT INTO tb_user VALUES ('3','小王',"广州市海珠区")
```

## 访问地址
>前端地址: http://{ip}:8088/user.html

>接口地址
所有用户： http://{ip}:8088/user/userList
删除用户： http://{ip}:8088/user/delete/{id}
