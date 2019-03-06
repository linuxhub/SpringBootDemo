#指定基础镜像
FROM java:8-jre

#维护者信息
MAINTAINER zeping root@linuxhub.org

#镜像的操作指令
ADD target/www-0.0.1-SNAPSHOT.jar /app/www.jar 
CMD ["java", "-Xmx200m", "-jar", "/app/www.jar"]

# 暴露端口
EXPOSE 8088
