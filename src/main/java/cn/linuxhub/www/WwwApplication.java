package cn.linuxhub.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// 扫描包 
@SpringBootApplication(scanBasePackages={"cn.linuxhub.www"})

public class WwwApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwwApplication.class, args);
	}

}
